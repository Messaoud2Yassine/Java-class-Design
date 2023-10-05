package com.service;

public class WebLogic {
	
	ServiceInterface serviceInterface;
	
	public WebLogic(ServiceInterface serviceInterface) {
		this.serviceInterface = serviceInterface;
	}
	public void callService(ServiceInterface serviceInterface) {
		serviceInterface.invoke();	
		
	}
	public static void main(String[] args) {
		ServiceInterface serviceInterface ;
		serviceInterface = new ServiceImpl3("service 3");
		WebLogic webLogic = new WebLogic(serviceInterface);
		webLogic.callService(serviceInterface);
		
	}

}
