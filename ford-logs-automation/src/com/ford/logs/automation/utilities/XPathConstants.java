package com.ford.logs.automation.utilities;

public class XPathConstants {
	
	public static String URL = "https://webvpn213.ford.com/+CSCOE+/logon.html";
	public static String hteamURL[] = {"id","unicorn_form_url","www.hteam.ford.com"};
	public static String browseURL[] = {"id","browse_text"};
	
	//after hteam browser
	public static String webTools[] = {"link","WebTools"};
	public static String selectProject[] = {"name","projectName","origin.owner.ford.com"}; 
	public static String selectButton[] = {"name","page"}; 
	public static String manageActiveLogs[] = {"link","Manage Active Logs"};
	public static String prod[] = {"link","PROD"};
	
	public static class BlackScreenCreds{
		public static String bodyText = "WEB SINGLE LOGIN";
		public static String UserId[]={"id","ADloginUserIdInput","SPENMET1"};
		public static String Pwd[]={"id","ADloginPasswordInput","owner8"};
		public static String concourButton[] = {"id","ADloginWSLSubmitButton"};
	}
}
