package com.flab.shorturl.controller;

import java.net.URI;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/url", produces = "application/json;charset=utf-8")
public class URLController {

	@GetMapping
	String testSpring() {
		return "success";
	}

	@PostMapping
	String createShortURL(@RequestBody String url) {
		return url;
	}

	@GetMapping("/{url}")
	ResponseEntity<?> redirectURL(@PathVariable String url) {
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(URI.create("https://www.naver.com"));
		return new ResponseEntity<>(headers, HttpStatus.MOVED_PERMANENTLY);
	}
}
