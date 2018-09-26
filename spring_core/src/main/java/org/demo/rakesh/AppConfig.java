package org.demo.rakesh;

import org.demo.services.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages="org.demo.services")
public class AppConfig {

	@Bean
	public Point getPoint() {
		Point point = new Point();
		point.setX(10);
		point.setY(50);
		return point;
	}
}
