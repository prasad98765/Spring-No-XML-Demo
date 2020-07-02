package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@Configurable
@ComponentScan("com.luv2code.springdemo")
//@PropertySource("classpath:sport.properties")
public class SportConfig {

	
}
