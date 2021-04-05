package com.wolken.wolkenapp;

public class DanceFormsUtil {
	
	public static void main(String []args) {
		DanceForms danceForms = new DanceForms("garba",45,"gujarat");
		DanceForms danceForms1 = new DanceForms("asasd",45,"gujarat");
		System.out.println(danceForms1.style+" "+danceForms1.noOfPerformers+" "+danceForms1.origin);
		System.out.println(danceForms.style+" "+danceForms.noOfPerformers+" "+danceForms.origin);
	}
	

}
