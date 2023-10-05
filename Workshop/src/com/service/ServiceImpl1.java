package com.service;

public class ServiceImpl1 extends AbstractService {
	public ServiceImpl1(String nom) {
		super(nom);
	}

	@Override
	void invokeService() {
		System.out.println("invocation service 1");
		
	}

}
