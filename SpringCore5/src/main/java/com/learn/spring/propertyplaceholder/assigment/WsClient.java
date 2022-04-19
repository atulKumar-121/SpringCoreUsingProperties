package com.learn.spring.propertyplaceholder.assigment;

public class WsClient {
	private String url;
	private String userName;
	private String passWord;
	public WsClient(String url, String userName, String passWord) {
		super();
		this.url = url;
		this.userName = userName;
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "WsClient [url=" + url + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
	
}
