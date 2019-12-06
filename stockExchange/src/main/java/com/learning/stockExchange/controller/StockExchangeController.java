package com.learning.stockExchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.stockExchange.entity.StockExchangeEntity;
import com.learning.stockExchange.service.IStockExchangeService;


@RestController
@CrossOrigin
@RequestMapping({ "/stockExchange" })
public class StockExchangeController {
	
    @Autowired
    private IStockExchangeService stockExchangeService;
	
    @RequestMapping(value = "/findAll",method = RequestMethod.GET,
            produces = "application/json")
	public ResponseEntity<List<StockExchangeEntity>> findAllStockExchange() {
    	
    	List<StockExchangeEntity> stockExchangeList = stockExchangeService.findAllStockExchange();
        if(stockExchangeList == null || stockExchangeList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(stockExchangeList, HttpStatus.OK);
	}

}
