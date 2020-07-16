package com.capg.obs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="OrderInfo")
public class OrderInfo {
@Id

@Column(name="order_Id")
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
@SequenceGenerator(sequenceName = "order_sequence", allocationSize = 10, name = "order_seq")
private Long Order_Id;

@NotEmpty(message = "RecipientName is mandatory")
@Column(name="RecipientName")
@Length(min=8, max=30)
private String RecipientName;

@NotEmpty(message = "RecipientPhone is mandatory")
@Column(name="RecipientPhone")
@Length(min=10, max=15)
private Long RecipientPhone;

@NotEmpty(message = "StreetAddress is mandatory")
@Column(name="StreetAddress")
@Length(min=10, max=128)
private String StreetAddress;

@NotEmpty(message = "city name is mandatory")
@Column(name="city")
@Length(min=3, max=32)
private String city;

@NotEmpty(message = "ZipCode is mandatory")
@Column(name="ZipCode")
@Length(min=3, max=24)
private String ZipCode;

@NotEmpty(message = "Country name is mandatory")
@Column(name="Country")
@Length(min=3, max=64)
private String Country;


@Column(name="Quantity")
private Integer Quantity;


@Column(name="SubToatl")
private Float SubToatl;


@Column(name="Total")
private Float Total;


@Column(name="OrderStatus")
private String OrderStatus;

@NotEmpty(message = "PaymentMethos is mandatory")
@Column(name="PaymentMethos")
@Length(min=8, max=16)
private String PaymentMethos;

public Long getOrderId() {
	return Order_Id;
}

public void setOrderId(Long order_Id) {
	Order_Id = order_Id;
}

public String getRecipientName() {
	return RecipientName;
}

public void setRecipientName(String recipientName) {
	RecipientName = recipientName;
}

public Long getRecipientPhone() {
	return RecipientPhone;
}

public void setRecipientPhone(Long recipientPhone) {
	RecipientPhone = recipientPhone;
}

public String getStreetAddress() {
	return StreetAddress;
}

public void setStreetAddress(String streetAddress) {
	StreetAddress = streetAddress;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getZipCode() {
	return ZipCode;
}

public void setZipCode(String zipCode) {
	ZipCode = zipCode;
}

public String getCountry() {
	return Country;
}

public void setCountry(String country) {
	Country = country;
}

public Integer getQuantity() {
	return Quantity;
}

public void setQuantity(Integer quantity) {
	Quantity = quantity;
}

public Float getSubToatl() {
	return SubToatl;
}

public void setSubToatl(Float subToatl) {
	SubToatl = subToatl;
}

public Float getTotal() {
	return Total;
}

public void setTotal(Float total) {
	Total = total;
}

public String getOrderStatus() {
	return OrderStatus;
}

public void setOrderStatus(String orderStatus) {
	OrderStatus = orderStatus;
}

public String getPaymentMethos() {
	return PaymentMethos;
}

public void setPaymentMethos(String paymentMethos) {
	PaymentMethos = paymentMethos;
}

@Override
public String toString() {
	return "OrderInfo [Order_Id=" + Order_Id + ", RecipientName=" + RecipientName + ", RecipientPhone=" + RecipientPhone
			+ ", StreetAddress=" + StreetAddress + ", city=" + city + ", ZipCode=" + ZipCode + ", Country=" + Country
			+ ", Quantity=" + Quantity + ", SubToatl=" + SubToatl + ", Total=" + Total + ", OrderStatus=" + OrderStatus
			+ ", PaymentMethos=" + PaymentMethos + "]";
}

public OrderInfo(Long orderId,
		@NotEmpty(message = "RecipientName is mandatory") @Length(min = 8, max = 30) String recipientName,
		@NotEmpty(message = "RecipientPhone is mandatory") @Length(min = 10, max = 15) Long recipientPhone,
		@NotEmpty(message = "StreetAddress is mandatory") @Length(min = 10, max = 128) String streetAddress,
		@NotEmpty(message = "city name is mandatory") @Length(min = 3, max = 32) String city,
		@NotEmpty(message = "ZipCode is mandatory") @Length(min = 3, max = 24) String zipCode,
		@NotEmpty(message = "Country name is mandatory") @Length(min = 3, max = 64) String country, Integer quantity,
		Float subToatl, Float total, String orderStatus,
		@NotEmpty(message = "PaymentMethos is mandatory") @Length(min = 8, max = 16) String paymentMethos) {
	super();
	Order_Id = orderId;
	RecipientName = recipientName;
	RecipientPhone = recipientPhone;
	StreetAddress = streetAddress;
	this.city = city;
	ZipCode = zipCode;
	Country = country;
	Quantity = quantity;
	SubToatl = subToatl;
	Total = total;
	OrderStatus = orderStatus;
	PaymentMethos = paymentMethos;
}

public OrderInfo() {
	super();
	// TODO Auto-generated constructor stub
}



}
