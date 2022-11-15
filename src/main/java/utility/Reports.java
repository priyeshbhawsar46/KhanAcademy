package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static ExtentReports createReports() {
	ExtentReports reports = new ExtentReports();//data collect
	ExtentSparkReporter html = new ExtentSparkReporter("Extentreports.html");
    
	reports.attachReporter(html);
	
	reports.setSystemInfo("Test", "Regression");
	
	return reports;
	
	}
}
