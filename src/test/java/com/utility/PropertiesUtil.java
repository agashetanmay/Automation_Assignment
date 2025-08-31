package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.constants.Env;

public class PropertiesUtil {

public static String readProperty(Env env ,String PropertyName) {
	File propFile = new File(System.getProperty("user.dir") + "\\config\\"+env+".properties");
	FileReader fileReader;
	Properties properties = new Properties();
	try {
		fileReader = new FileReader(propFile);
		properties.load(fileReader);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	String value = properties.getProperty(PropertyName.toUpperCase());
	return value;
}
}
