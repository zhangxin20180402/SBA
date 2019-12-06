package com.learning.stockExchange.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.stockExchange.dao.IStockExchangeDao;
import com.learning.stockExchange.entity.StockExchangeEntity;
import com.learning.stockExchange.service.IStockExchangeService;

@Service
public class StockExchangeServiceImpl implements IStockExchangeService{
	
    @Autowired 
    private IStockExchangeDao stockExchangeDao;

	@Override
	public List<StockExchangeEntity> findAllStockExchange() {
		return stockExchangeDao.findAll();
	}

}
