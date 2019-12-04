package com.learning.uploadExcel.service;

import java.util.List;

import com.learning.uploadExcel.entity.StockPriceEntity;

public interface IStockService {
	
	void saveStockPrice(List<StockPriceEntity> stockPrices);

}
