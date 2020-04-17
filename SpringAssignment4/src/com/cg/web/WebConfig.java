package com.cg.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cg.entity.Emp;
import com.cg.entity.Question;

@Configuration
@ComponentScan("com.cg")
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{

	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource rb =new ResourceBundleMessageSource();
		rb.setBasename("cg");
		return rb;
	}
	
	@Bean(name="ebean")
	public Map<Integer, Emp> getEmployee(){
		Map<Integer,Emp> emap =new HashMap<>();
		emap.put(1001, new Emp(1001, "ram kumar", 56000, "hr"));
		emap.put(1002, new Emp(1002, "sai kumar", 36000, "pr"));
		return emap;
	}
	
	@Bean(name="qbean")
	public Map<Integer, Question> getQuestions(){
		Map<Integer,Question> qmap =new HashMap<>();
		qmap.put(1, new Question("1","size of int type", "1", "2", "4", "4"));
		qmap.put(2, new Question("2","size of byte type", "1", "2", "4", "1"));
		qmap.put(3, new Question("3","size of short type", "1", "2", "4", "2"));
		qmap.put(4, new Question("4","size of float type", "1", "2", "4", "4"));
		qmap.put(5, new Question("5","which collection holds unique elements", 	"list", "set", "queue", "set"));
		return qmap;
	}

	@Bean
	public HandlerInterceptor getInterceptor() {
		return new MyInterceptor();
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(getInterceptor());
	}
	
	
}











