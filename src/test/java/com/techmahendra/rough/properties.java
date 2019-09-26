package com.techmahendra.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {
	public static void main(String[] args) throws IOException {
		Properties config = new Properties();
		System.out.println(System.getProperty("user.dir"));
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);
		System.out.println(config.getProperty("browser"));
		Properties OR = new Properties();
		fis = new FileInputStream("F:\\SeleniumPrasanth\\DataDrivenFramework\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
	}

}
