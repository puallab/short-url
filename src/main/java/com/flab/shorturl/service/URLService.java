package com.flab.shorturl.service;

import org.springframework.stereotype.Service;

import com.flab.shorturl.repository.URLRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class URLService {
	private static URLRepository repository;
}
