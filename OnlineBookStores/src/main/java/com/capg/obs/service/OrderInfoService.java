package com.capg.obs.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.obs.dao.OrderInfoDao;
import com.capg.obs.entity.OrderInfo;


@Service

public class OrderInfoService implements OrderInfoServiceInterface{
	
	@Autowired
	private OrderInfoDao OrderInfoDao;
	
	@Transactional
	public OrderInfo updateOrderInfo(OrderInfo OrderInfo)
	{
		Optional<OrderInfo> optionalOrderInfo=OrderInfoDao.findById(OrderInfo.getOrderId());
		if(optionalOrderInfo.isPresent()) {
			return OrderInfoDao.save(OrderInfo);
		}
		return OrderInfo;
		
	}
	
}
