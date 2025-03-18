package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) 
	{

		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	   Object obj = ctx.getBean("wmg");
	   
	   WishMessageGenerator generator = (WishMessageGenerator)obj;
	   
	   String msg = generator.showWishMessage("Biswajit");
	   System.out.println("Result : " + msg);
	   System.out.println("Current Season : " + generator.showSeason());
	   ctx.close();
	}

}
