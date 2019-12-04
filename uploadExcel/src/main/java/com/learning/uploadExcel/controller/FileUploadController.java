package com.learning.uploadExcel.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.learning.uploadExcel.entity.StockPriceEntity;
import com.learning.uploadExcel.service.IStockService;

@RestController
@CrossOrigin
public class FileUploadController {
	
	DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
	
    @Autowired
    private IStockService stockService;
	
	private static final Logger logger = Logger.getLogger(FileUploadController.class.getName());
	@PostMapping("/api/upload")
	public ResponseEntity<String> uploadData(@RequestParam("file") MultipartFile file) throws Exception {
		if (file == null) {
			throw new RuntimeException("You must select the a file for uploading");
		}
		InputStream inputStream = file.getInputStream();
		String originalName = file.getOriginalFilename();
		String name = file.getName();
		String contentType = file.getContentType();
		long size = file.getSize();
		logger.info("inputStream: " + inputStream);
		logger.info("originalName: " + originalName);
		logger.info("name: " + name);
		logger.info("contentType: " + contentType);
		logger.info("size: " + size);
		
		List<StockPriceEntity> stockPrices = new LinkedList<StockPriceEntity>();
		StockPriceEntity stockPrice;

    	try {
            BufferedReader stockPricein = new BufferedReader(new InputStreamReader(inputStream));
            String stockPriceLine = "";
            String[] stockPriceInfo;
            
            //do not process first line, because it is header.
            stockPricein.readLine();
            
            while ((stockPriceLine = stockPricein.readLine()) != null) {
            	stockPriceInfo = stockPriceLine.split(",");
            	
            	logger.info(stockPriceLine);
            	
            	stockPrice = new StockPriceEntity();
            	stockPrice.setCompanyCode(stockPriceInfo[0]);
            	stockPrice.setStockExchange(stockPriceInfo[1]);
            	stockPrice.setCurrentPrice(Float.parseFloat(stockPriceInfo[2]));
            	stockPrice.setCurrentDate(new java.sql.Date(df.parse(stockPriceInfo[3]).getTime()));
            	stockPrice.setCurrentTime(java.sql.Time.valueOf(stockPriceInfo[4]));
            	
            	stockPrices.add(stockPrice);
            	
            	System.out.println(stockPriceLine);
            }
            
            stockPricein.close();

		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
    	
    	stockService.saveStockPrice(stockPrices);

		// Do processing with uploaded file data in Service layer
		return new ResponseEntity<String>(originalName, HttpStatus.OK);
	}

}
