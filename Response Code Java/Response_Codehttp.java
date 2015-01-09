import org.apache.http.client.fluent.Request;

/*
 * To get the HTTP Response codes you will need to download the appropriate .jar from this site
 * http://www.java2s.com/Code/Jar/f/Downloadfluenthc421jar.htm
 * File name: fluent-hc-4.2.1.jar
 * Understand Selenium WebDriver team doesnt support this 
 */

public class Response_Codehttp {
	
	

	public static void main(String[] args) {
		
		String url = "http://www.google.com";

		        try {
		            int resp_code=  Request.Get(url).execute().returnResponse().getStatusLine()
		                    .getStatusCode();
		            System.out.println(resp_code);
		        } catch (Exception e) {
		            throw new RuntimeException(e);
		        }
		    }
		
		
	}


