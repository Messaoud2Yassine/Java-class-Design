package com.service;

public class ServiceImpl2 extends AbstractService implements ApiInterface {
	public ServiceImpl2(String nom) {
		super(nom);
	}
	@Override
	void invokeService() {
		System.out.println("invocation service 2");
		
	}

	@Override
	public void consommerApi() {
		System.out.println("consommer un api");
		
	}

}
