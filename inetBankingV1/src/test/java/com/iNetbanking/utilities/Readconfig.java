package com.iNetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.util.SystemOutLogger;

public class Readconfig {
	Properties pro;

	public Readconfig() {
		File src = new File ("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			} catch (Exception e) {
				System.out.println("Exception is " + e.getMessage());
			}
								
	}

	public String getapplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() {
		String username = pro.getProperty("userName");
		return username;
	}
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	public String getchromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getfirefoxpath() {
		String ffpath = pro.getProperty("firefoxpath");
		return ffpath;
	}
	
}
