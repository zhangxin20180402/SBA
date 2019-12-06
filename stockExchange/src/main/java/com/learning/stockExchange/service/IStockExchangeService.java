package com.learning.stockExchange.service;

import java.util.List;

import com.learning.stockExchange.entity.StockExchangeEntity;

public interface IStockExchangeService {

	List<StockExchangeEntity> findAllStockExchange();
}
