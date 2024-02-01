package utility;


import java.io.IOException;
import java.util.Properties;

import constants.Constants;

public class CommonUtilities {

	public  void loadProperties() {
		
		
		Properties properties=new Properties();
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Constants.APP_URL= properties.getProperty("Url");
		Constants.CHROME_LOCATION=properties.getProperty("ChromeLocation");
		Constants.BROWSER=properties.getProperty("BROWSER");
	}


}
