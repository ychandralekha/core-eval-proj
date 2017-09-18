package com.cts.util;

import java.util.Map;

import com.cts.pojo.CustomerDetails;

public class MapToPojo {
public CustomerDetails mapToPojo(Map<String, String[]>details)
{
	CustomerDetails customerDetails=new CustomerDetails();
	customerDetails.setCustomerName(details.get("")[0]);
	return customerDetails;
}
}
