package com.capgemini.obs.Dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.obs.entity.OrderInfo;
@Repository
public interface OrderDao extends JpaRepository<OrderInfo, Integer>{
	
	  public List<OrderInfo> findByOrderId(Integer orderId);
	  

	 
   
   

}
