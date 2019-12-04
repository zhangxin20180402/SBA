package com.learning.uploadExcel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.learning.uploadExcel.dao.IStockDao;
import com.learning.uploadExcel.entity.StockPriceEntity;
import com.learning.uploadExcel.service.IStockService;

@Service
public class StockPriceImpl implements IStockService{
	
    @Autowired 
    private IStockDao stockDao;

    @Transactional(propagation = Propagation.REQUIRED,
            isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class})
	@Override
	public void saveStockPrice(List<StockPriceEntity> stockPrices) {
		stockDao.deleteAll();
		stockDao.saveAll(stockPrices);
		
		stockDao.flush();
	}

}
