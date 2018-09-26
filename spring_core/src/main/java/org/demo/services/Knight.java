package org.demo.services;

import javax.inject.Qualifier;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Knight implements InitializingBean {
	
	private Wand wand;

	
	
	
	public Wand getWand() {
		return wand;
	}


	@Autowired
	public void setWand(Wand wand) {
		this.wand = wand;
	}



	


	



	public void action() {
		//magic.beforeMagic();
		wand.spell();
		//magic.afterMagic();
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Knight bean created");
		
	}


}
