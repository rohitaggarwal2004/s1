package com.example.hello.bean;

public class HelloBean {
	private String text;
	private String hi;

	public String getHi() {
		return hi;
	}

	public void setHi(String hi) {
		this.hi = hi;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	protected HelloBean() {

	}

	public HelloBean(String text) {
		this.text = text;
	}
}
