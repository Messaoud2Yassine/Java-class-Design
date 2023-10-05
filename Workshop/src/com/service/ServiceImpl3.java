package com.service;

public class ServiceImpl3 extends AbstractService implements ApiInterface {

	public ServiceImpl3(String nom) {
		super(nom);
	}
	@Override
	void invokeService() {
		System.out.println("invocation service 3");
		
	}

	@Override
	public void consommerApi() {
		System.out.println("consommer un api");
		
	}

}
