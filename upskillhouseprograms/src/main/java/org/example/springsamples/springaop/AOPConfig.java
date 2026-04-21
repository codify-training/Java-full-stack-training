package org.example.springsamples.springaop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.springsamples.springaop")
@EnableAspectJAutoProxy
public class AOPConfig {
}
