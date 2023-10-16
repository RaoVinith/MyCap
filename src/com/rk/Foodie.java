package com.rk;

public class Foodie {
	
	 int fid;
	 String foodname;
	 String city;
	 int mobileno;
	 int totalprice;
	public Foodie(int fid, String foodname, String city, int mobileno, int totalprice) {
		super();
		this.fid = fid;
		this.foodname = foodname;
		this.city = city;
		this.mobileno = mobileno;
		this.totalprice = totalprice;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "Foodie [fid=" + fid + ", foodname=" + foodname + ", city=" + city + ", mobileno=" + mobileno
				+ ", totalprice=" + totalprice + "]";
	}
	 
	 

	 

}
