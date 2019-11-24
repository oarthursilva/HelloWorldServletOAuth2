package service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.OAuth2Configuration;
import exception.OAuthException;

public class HelloWorldService {

	private OAuth2Configuration oAuth2Configuration;

	public HelloWorldService() {
		this.oAuth2Configuration = new OAuth2Configuration();
	}
	
	public void handleGetRequest(HttpServletRequest request, HttpServletResponse response) throws OAuthException, IOException {
		this.oAuth2Configuration.checkAuthorization(request);
		
		PrintWriter pw = response.getWriter();
		pw.println("Contact light");
	}

}
