package com.service;

public abstract class AbstractService implements ServiceInterface {
	protected String nom;
	public AbstractService(String nom) {
		this.nom=nom;
	}
	
	public void invoke() {
		System.out.println("****traitemt de début****");
		invokeService();
		System.out.println(AffichageService.afficherNom(nom));
	}
	
	abstract void invokeService();

}
