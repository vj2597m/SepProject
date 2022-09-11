package org.company;

public class Company extends Client {
	
	private void companyName() {
		System.out.println("IBM");
	}
	
	public static void main(String[] args) {
		Company com=new Company();
		com.companyName();
		com.clientName();
	}

}
