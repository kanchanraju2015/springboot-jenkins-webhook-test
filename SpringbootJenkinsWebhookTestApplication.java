package com.briz.springboot_jenkins_webhook_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
	// hello jenkins
	// hello jenkins report 
public class SpringbootJenkinsWebhookTestApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootJenkinsWebhookTestApplication.class, args);
	}
@RequestMapping("/test")
public String test()
{
	return "this is jenkins webhook test";
}

// for build periodically use * * * * * for per minute
//  for build periodically use H/2 * * * * for every 2 minute
//for build periodically use   0 * * * * for per every hour
// for every 115 minutes    */15 * * * *

@RequestMapping("/jenkins")
public String test1()
{
	return "this is jenkins webhook test example";
}
@RequestMapping("/gitpush")
public String push()
{
return "this is gitpush webhook";	
}

}
