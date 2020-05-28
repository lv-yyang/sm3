package com.ly.pojo;

public class Book {

	private int id;
	private String name;
	private float price;
	private String leixing;
	private String zuozhe;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getLeixing() {
		return leixing;
	}
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	public String getZuozhe() {
		return zuozhe;
	}
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", leixing=" + leixing + ", zuozhe=" + zuozhe
				+ "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, float price, String leixing, String zuozhe) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.leixing = leixing;
		this.zuozhe = zuozhe;
	}
	
	public Book(String name, float price, String leixing, String zuozhe) {
		super();
		this.name = name;
		this.price = price;
		this.leixing = leixing;
		this.zuozhe = zuozhe;
	}
}
