package com.reactive.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactive.model.Foo;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/app")
public class TestController {
	
	@GetMapping("/data")
	public Flux<Foo> getData() {
		return Flux.interval(Duration.ofSeconds(1))
			        .map(foo -> new Foo()).log();
	}
}
