package com.github.exabrial.tomeehttprequestbug.jsf.page;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

@Named
@ViewScoped
public class IndexPage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private HttpServletRequest request;

	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct() invoked, request:" + request);
	}

	public HttpServletRequest getRequest() {
		return request;
	}
}
