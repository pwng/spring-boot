package com.ngpanwei;

import com.ngpanwei.error.AppErrorController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Configuration
@EnableWebMvc
public class ScorecardApplication {
	@Autowired
	private ErrorAttributes errorAttributes;

	@Bean
	public AppErrorController appErrorController(){
		return new AppErrorController(errorAttributes);
	}

	public static void main(String[] args) {

	    SpringApplication.run(ScorecardApplication.class, args);
	}

}


