package com.capg.obs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.obs.entity.OrderInfo;

@Repository
public interface OrderInfoDao extends JpaRepository<OrderInfo , Long>{

}

