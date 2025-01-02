package selenium;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemo {

	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentHtmlReporter htmlReporter;
	public static SimpleDateFormat simpleDate;
	 
	public static void main(String[] args) throws IOException {
		 
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy-HH-mm-ss");
		String strDate = formatter.format(date);
		htmlReporter = new ExtentHtmlReporter("test-output\\ExtentReportResults - " + strDate + ".html");
		extent = new ExtentReports();//Create Empty Report
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
		//First Test Case
		test=extent.createTest("First Test Case");
		test.log(Status.PASS, "Test Step#1 passed");
		test.log(Status.PASS, "Test Step#2 passed");
		test.log(Status.FAIL, "Test Step#3 failed");
		extent.flush();
		
		//Second Test Case
		test=extent.createTest("Second Test Case");
		test.log(Status.PASS, "Test Step#1 passed");
		test.log(Status.PASS, "Test Step#2 passed");
		test.log(Status.FAIL, "Test Step#3 failed"+test.addScreenCaptureFromPath("F:\\Automation Training\\Rough\\sample0722.png"));
		extent.flush();
	}

}
