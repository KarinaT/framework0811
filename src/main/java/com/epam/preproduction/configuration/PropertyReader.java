package com.epam.preproduction.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	private static final String sFileName = "configurations.properties";
	private static String sDirSeparator = System.getProperty("file.separator");
	private static Properties props = new Properties();

	static {
		File currentDir = new File(".");
		try {
			String sFilePath = currentDir.getCanonicalPath() + sDirSeparator+ sFileName;

			FileInputStream ins = new FileInputStream(sFilePath);
			props.load(ins);

		} catch (FileNotFoundException e) {

			System.out.println("File not found!");

			e.printStackTrace();

		} catch (IOException ex) {

			System.out.println("IO Error!");

			ex.printStackTrace();

		}
	}

	public static String getInputExcelFileName() {
		return props.getProperty("fileInputExcel");
	}
	
	public static String getScreenShotsDestinationFolder(){
		return props.getProperty("fileOutputScreenshot");
	}
	
	public static String getScreenShotsFileExtension(){
		return props.getProperty("screenShotsFileExtension");
	}
	
	public static String getOperaBrowser(){
		return props.getProperty("operaBrowser");
	}

	
	
	

}
