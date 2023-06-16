package com.abc.intro;

public class CustomerManager implements ICustomerService{
	private ICustomerDal customerDal;//ICustomerDal bir referrence type dir ve bu o interfaceyi implement eden tüm claassları tutabilir
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	public void add() {
		customerDal.add();
	}
}
