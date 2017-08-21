package biz.mathias.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import biz.mathias.domain.Organization;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class);
		Organization org=(Organization) ctx.getBean("organization");
		org.say();
	}
}
