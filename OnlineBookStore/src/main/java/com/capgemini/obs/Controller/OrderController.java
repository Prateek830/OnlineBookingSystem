package com.capgemini.obs.Controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.obs.Service.OrderService;
import com.capgemini.obs.entity.OrderInfo;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	  @PutMapping("/order") 
	  public ResponseEntity<OrderInfo> updateOrder(@Valid @RequestBody OrderInfo orderInfo) {
		  OrderInfo order=orderService.update(orderInfo);
	  	return new ResponseEntity<OrderInfo>(order, HttpStatus.OK); }
	 
}
