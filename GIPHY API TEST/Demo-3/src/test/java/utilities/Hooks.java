package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import runners.BaseClass;

public class Hooks extends BaseClass {

    public BaseClass base;

    public Hooks(BaseClass base) {
        this.base = base;
    }


    @Before
    public void initDriver() {
        System.out.println("Open browser");
    }

    @After
    public void afterMethod(Scenario scenario) {
       
    }
}