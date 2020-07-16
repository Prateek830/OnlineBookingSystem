package com.capg.obs.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.capg.obs.entity.OrderInfo;
import com.capg.obs.exception.OrderInfoException;
import com.capg.obs.service.OrderInfoService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class OrderInfoController {
	@Autowired
	private OrderInfoService OrderInfoservice;
	
	@CrossOrigin
	@PutMapping("/updateOrderInfo")
	public ResponseEntity<String> updateOrderInfo(@Valid @RequestBody OrderInfo OrderInfo, BindingResult br ) throws OrderInfoException
	{
		String err = "";
		if (br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new OrderInfoException(err);
		}
		try {
			OrderInfoservice.updateOrderInfo(OrderInfo);
			return new ResponseEntity<String>("order updated successfully", HttpStatus.OK);

		} catch (DataIntegrityViolationException ex) {
			throw new OrderInfoException("orderId already exist");
		}
	}
}
