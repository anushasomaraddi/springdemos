package com.examples.S03stereotypes.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("chennai")
private String city;
	@Value("TN")
private String state;
	@Value("5009")
private String pincode;
public String getCity() {
	return city;
}
//public void setCity(String city) {
//	this.city = city;
//}
//public String getState() {
//	return state;
//}
//public void setState(String state) {
//	this.state = state;
//}
//public String getPincode() {
//	return pincode;
//}
//public void setPincode(String pincode) {
//	this.pincode = pincode;
//}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
}

}
