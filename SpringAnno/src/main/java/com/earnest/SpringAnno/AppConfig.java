package com.earnest.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.earnest.SpringAnno")
public class AppConfig 
{
//	@Bean                           function replaced by @componentscan
//	public Samsung getPhone()
//	{
//		return new Samsung();
//	}
	
//	@Bean							function replace by @componentscan
//	public MobileProcessor getProcessor()
//	{
//		return new Snapdragon();
//	}
	
}
