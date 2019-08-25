package com.azaz.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	ResourceBundleMessageSource messageSource;
	@GetMapping(path="/hello-world/{name}")
	public String helloWorld(@PathVariable String name) {
		return String.format("Helloo %s", name);
	}
	
//	@GetMapping(path="/hello-world")
//	public String helloWorld(@RequestHeader(name="Accept-Language", required=false) Locale locale) {
//		return messageSource.getMessage("good.morning.message", null, locale);
//	}
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}
}
