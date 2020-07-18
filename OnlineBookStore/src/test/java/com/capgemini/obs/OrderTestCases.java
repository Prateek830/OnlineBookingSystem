package com.capgemini.obs;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.capgemini.obs.Dao.OrderDao;
import com.capgemini.obs.exception.OrderInfoException;
import com.capgemini.obs.Service.OrderService;
import com.capgemini.obs.entity.OrderInfo;

public class OrderTestCases {
	@Mock
    private OrderDao orderDao;

    @InjectMocks
    private OrderService orderServiceTest;
    
    @Test
    void update() throws OrderInfoException {
    	OrderInfo orderInfo=new OrderInfo();
    	orderInfo.setOrderId(6);
    	orderInfo.setSubToatl((float) 599);
    	orderInfo.setTotal((float) 599);
    	
    	Mockito.when(orderDao.save(orderInfo)).thenReturn(orderInfo);
    	assertThat(orderServiceTest.update(orderInfo)).isEqualTo(orderInfo);
    	
    }
    
    
	
}
