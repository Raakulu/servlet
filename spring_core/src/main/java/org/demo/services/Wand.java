package org.demo.services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Wand implements InitializingBean, DisposableBean  {
	
	public void spell() {
		System.out.println("Alohomora....!!");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("wand created");
		
	}

}
