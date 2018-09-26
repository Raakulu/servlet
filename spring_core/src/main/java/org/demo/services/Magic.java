package org.demo.services;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


public class Magic implements InitializingBean{

	public void beforeMagic() {
		System.out.println("wooshhhhhhhhh..........");
	}
	
	public void afterMagic() {
		System.out.println("wooshhhhhhhhh..........");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("magic bean created");
	}
}
