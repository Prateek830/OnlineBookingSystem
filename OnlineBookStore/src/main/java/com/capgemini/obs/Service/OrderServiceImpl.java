package com.capgemini.obs.Service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.obs.Dao.OrderDao;
import com.capgemini.obs.entity.OrderInfo;
import com.capgemini.obs.exception.OrderInfoException;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDao orderDao;
	
	 @Override 
	  public OrderInfo update(OrderInfo orderInfo) throws OrderInfoException{
		 Integer OrderId=orderInfo.getOrderId();
		  if(orderDao.findByOrderId(OrderId)==null) {
			  throw new OrderInfoException("No changes Found");
		  }
		  Integer tempQuantity=orderInfo.getQuantity();
		  Float tempSubTotal=orderInfo.getSubToatl();
		  Float temp=tempQuantity*tempSubTotal;
		  orderInfo.setTotal(temp);
		  return orderDao.save(orderInfo);
	  }	

}
