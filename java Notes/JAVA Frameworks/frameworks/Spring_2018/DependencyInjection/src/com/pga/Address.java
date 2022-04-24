package com.pga;

public class Address {
	private String city;
	private String area;
	private String pincode;

	public Address() {}
	public Address(String city, String area, String pincode) {
		super();
		this.city = city;
		this.area = area;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", area=" + area + ", pincode=" + pincode + "]";
	}
	
}
