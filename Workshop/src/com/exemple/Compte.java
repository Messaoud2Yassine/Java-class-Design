package com.exemple;


public abstract class Compte implements A  {
	public double solde;
	public int numero;
	public static String nom;
	
	public Compte(double solde) {
		this.solde=solde;
		
	}
	public Compte() {
		
	}

	Compte virement(Double solde) {
    	return null;
    }
	
	protected String afficher() {
		return " Compte";
		
	}
	protected String afficher(String a) {
		return a;
		
	}
	@Override
	public String testImpl() {
		// TODO Auto-generated method stub
		return null;
	}
	
	abstract String test() ;
 
 public static void main(String[] args) {
}

}

class Epargne extends Compte{
	double solde;
	double min; 

	public Epargne(double solde, double min) {
		this.solde=solde;
		this.min=min;
	}
	@Override
	protected Epargne virement(Double solde) {
    	return null;
    }
	
	public String afficher() {
		 return super.afficher();
		
	}
	
	public static void main(String[] args) {
		Compte c =  new Epargne(10, 0);
		System.out.println(Compte.nom);

	}
	@Override
	 String test() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
interface A {
	String a ="interface";
	String testImpl();
	default void defaultMethod() {
		
	}
}
