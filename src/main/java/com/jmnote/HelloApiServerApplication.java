package com.jmnote;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApiServerApplication {
	
	//@Value("${logfilename}")
	//private String logfilename;

	public static void main(String[] args) {
//		try {
//			System.setOut(new PrintStream(new FileOutputStream("log.txt",true)));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		System.out.print("hh--");
		
		SpringApplication.run(HelloApiServerApplication.class, args);
	}
}
