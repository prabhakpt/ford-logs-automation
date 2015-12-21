package com.ford.logs.aumation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.ford.logs.automation.utilities.XPathConstants.*;
import static com.ford.logs.automation.utilities.BrowserEvents.*;

public class FordLogsAutomation {

	@Before
	public void loadDriver(){
		createDriver("firefox");
	}
	
	@Test
	public void autoDownloadLogs() throws InterruptedException{
		openUrl(URL);
		System.out.println("Please enter username and rsa token and click on login button");
		Thread.sleep(10000);
		enterText(hteamURL[0], hteamURL[1], hteamURL[2]);
		clickByLocator(browseURL[0], browseURL[1]);
		System.out.println("verifying for black screen");
		if(isTextPresent(BlackScreenCreds.bodyText)){
			System.out.println("black screen available");
			enterText(BlackScreenCreds.UserId[0], BlackScreenCreds.UserId[1], BlackScreenCreds.UserId[2]);
			enterText(BlackScreenCreds.Pwd[0], BlackScreenCreds.Pwd[1], BlackScreenCreds.Pwd[2]);
			clickByLocator(BlackScreenCreds.concourButton[0], BlackScreenCreds.concourButton[1]);
		}
		Thread.sleep(4000);
		System.out.println("starting WEB Tools");
		clickByLocator(webTools[0], webTools[1]);
		selectByVisibleText(selectProject[0],selectProject[1],selectProject[2]);
		clickByLocator(selectButton[0], selectButton[1]);
		Thread.sleep(3000);
		clickByLocator(manageActiveLogs[0], manageActiveLogs[1]);
		Thread.sleep(3000);
		clickByLocator(prod[0], prod[1]);
		Thread.sleep(5000);
		
		System.out.println("loading ford logs.");
		Thread.sleep(20000);
	}
	
	@After
	public void closeFordDriver(){
		closeDriver();
	}

}
