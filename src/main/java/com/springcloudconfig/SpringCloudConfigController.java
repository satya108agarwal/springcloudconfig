package com.springcloudconfig;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class SpringCloudConfigController {

	@Value("${key1:none}")
	String key1;



	@RequestMapping("/testConfigClient")
	public String restaurant() {
		return String.format("key1 value is: %s", key1);
	}



}
