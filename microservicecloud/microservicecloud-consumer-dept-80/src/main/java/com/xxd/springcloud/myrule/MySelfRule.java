package com.xxd.springcloud.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {
	
	@Bean
	public IRule myRule() {
		// roboin 默认是轮询的访问方式，自定义改成 随机
		return new RandomRule_Xd();
	}
}
