package com.epam.mobile.testing.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigurationReader {
    private static final Logger LOG = LogManager.getRootLogger();
    private static final Properties properties = new Properties();
    private static ConfigurationReader instance;

    private ConfigurationReader() {

    }

    public static ConfigurationReader get() {
        if (instance == null) {
            instance = new ConfigurationReader();
            try {
                properties.load(new FileInputStream("src/main/resources/test.properties"));
            } catch (IOException e) {
                LOG.error("Properties were not loaded");
            }
        }
        return instance;
    }

    public String env() {
        return properties.getProperty("env.type");
    }

    public String appPath() {
        return properties.getProperty("app.path");
    }

    public String appPackage() {
        return properties.getProperty("app");
    }

    public String appActivity() {
        return properties.getProperty("app.activity");
    }

    public String platformName() {
        return properties.getProperty("platform.name");
    }

    public String platformVersion() {
        return properties.getProperty("platform.version");
    }

    public String localDeviceName() {
        return properties.getProperty("local.device.name");
    }

    public String udid() {
        return properties.getProperty("udid");
    }

    public String appiumAddress() {
        return properties.getProperty("appium.address");
    }

    public int appiumPort() {
        return Integer.parseInt(properties.getProperty("appium.port"));
    }


}
