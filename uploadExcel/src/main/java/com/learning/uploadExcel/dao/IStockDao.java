package com.learning.uploadExcel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.uploadExcel.entity.StockPriceEntity;

@Repository
public interface IStockDao extends JpaRepository<StockPriceEntity, Long> {

}
