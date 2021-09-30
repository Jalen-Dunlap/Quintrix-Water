package com.automationpractice.frameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	private static Properties properties;

	private static FileInputStream input;

	static {
		try {
			String path = "src/test/resources/configuration.properties";
			input = new FileInputStream(path);
			properties = new Properties();
			properties.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static String getProperty(String keyName) {
		return properties.getProperty(keyName);
	}

}
