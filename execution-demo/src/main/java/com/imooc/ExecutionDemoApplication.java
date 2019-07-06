package com.imooc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ExecutionDemoApplication {

	public static void main(String[] args) {
		run(ExecutionDemoApplication.class, args);
	}
}
