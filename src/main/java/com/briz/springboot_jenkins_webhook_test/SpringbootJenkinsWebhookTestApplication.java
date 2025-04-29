package com.briz.springboot_jenkins_webhook_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
	// hello jenkins
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
@RequestMapping("/jenkins")
public String test1()
{
	return "this is jenkins webhook test example";
}

}
