package stepDef;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Config {
    public static String url;
    public static String baseURL = System.getProperty("env");
    public static String driverType = System.getProperty("browser");
    @Before
    public void openBrowser(){
        driver = setupDriver(driverType);
        switch (baseURL){
            case "qa" :
                url = "http://qa.taltektc.com";
                break;
            case "stage" :
                url = "http://stage.taltektc.com";
                break;
            case "prod" :
                url = "http://prod.taltektc.com";
                break;
        }
        driver.get(url);
    }

    @After
    public void tearDown(){
//        driver.close();
//        driver.quit();
    }
}
