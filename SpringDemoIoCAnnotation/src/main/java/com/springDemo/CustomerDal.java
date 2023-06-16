package com.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class CustomerDal implements ICustomerDal {
	@Value("${database.connectionString}")//burada value anotasyonu connection stringin varsayılan değerini içerir hemen önce yazıldığuı için
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add() {
		System.out.println("Connection String : "+this.connectionString);
		System.out.println("oracle veritabanına eklendi");
	}
}
