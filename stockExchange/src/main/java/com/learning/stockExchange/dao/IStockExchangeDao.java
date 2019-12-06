package com.learning.stockExchange.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.stockExchange.entity.StockExchangeEntity;


@Repository
public interface IStockExchangeDao extends JpaRepository<StockExchangeEntity, Long> {

}
