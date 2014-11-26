import org.apache.http.client.fluent.Request;



/*
 * To get the HTTP Response codes you will need to download the appropriate .jar from this site
 * http://www.java2s.com/Code/Jar/f/Downloadfluenthc421jar.htm
 * File name: fluent-hc-4.2.1.jar
 * Understand Selenium WebDriver team doesnt support this 
 */

public class Response_code_TF {
	
	

	public static void main(String[] args) {
		System.out.println(checkResponse ("http://www.google.com"));
		//list your sites you want to check here
		//System.out.println(checkResponse ("http://www.gmail.com"));
		
		String url = "http://www.google.com";

		        try {
		            int resp_code=  Request.Get(url).execute().returnResponse().getStatusLine()
		                    .getStatusCode();
		            System.out.println(resp_code);
		        } catch (Exception e) {
		            throw new RuntimeException(e);
		        }
		    }
	

		
	public static boolean checkResponse(String url) {
		try {
            int resp_code=  Request.Get(url).execute().returnResponse().getStatusLine()
                    .getStatusCode();
                    System.out.println(checkResponse ("Response code for URL" + url + "is ->" + resp_code));
            	if(resp_code == 200) 
            		return true; 
            	else 
            		return false;
		
		} catch (Exception e) {
			return false;
    
	}
		
	}
	
}
		
	


