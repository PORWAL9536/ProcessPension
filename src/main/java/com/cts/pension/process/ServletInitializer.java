package com.cts.pension.process;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author vivek
 * defining the servlet initializer by extending the in-built SpringBootServletInitializer class.
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProcessPensionMicroserviceApplication.class);
	}

}
