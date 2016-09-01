package com.eshin.rmi;

public class HelloServiceImpl implements HelloService {

	@Override
	public String doHello(String name) {
		return "Hello ddd, " + name;  
	}

}
