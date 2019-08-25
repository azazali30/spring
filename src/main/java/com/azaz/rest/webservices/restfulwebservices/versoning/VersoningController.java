package com.azaz.rest.webservices.restfulwebservices.versoning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersoningController {
	
	@GetMapping("v1/person")
	public PersonV1 uriVersoning1() {
		return new PersonV1(101, "Md Azaz Ali");
	}
	@GetMapping("v2/person")
	public PersonV2 uriVersoning2() {
		return new PersonV2(new Name("Md Azaz", "ALi"), 101);
	}
	
	@GetMapping(value= "/person/param", params="verson=1")
	public PersonV1 paramsVersoning1() {
		return new PersonV1(101, "Md Azaz Ali");
	}
	@GetMapping(value="/person/param", params="verson=2")
	public PersonV2 paramsVersoning2() {
		return new PersonV2(new Name("Md Azaz", "ALi"), 101);
	}
	
	@GetMapping(value= "/person/header", headers="X-API-VERSON=1")
	public PersonV1 headersVersoning1() {
		return new PersonV1(101, "Md Azaz Ali");
	}
	@GetMapping(value="/person/header", headers="X-API-VERSON=2")
	public PersonV2 headersVersoning2() {
		return new PersonV2(new Name("Md Azaz", "ALi"), 101);
	}
	
	@GetMapping(value= "/person/produces", produces="application/vnd.company.app-v1+json")
	public PersonV1 producesVersoning1() {
		return new PersonV1(101, "Md Azaz Ali");
	}
	@GetMapping(value="/person/produces", produces="application/vnd.company.app-v2+json")
	public PersonV2 producesVersoning2() {
		return new PersonV2(new Name("Md Azaz", "ALi"), 101);
	}
	
	
}
