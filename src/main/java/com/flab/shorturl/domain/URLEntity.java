package com.flab.shorturl.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class URLEntity {
	private String url;
	private String shortURL;
	private long callCount = 0L;

	public URLEntity(String url, String shortURL) {
		this.url = url;
		this.shortURL = shortURL;
	}
}
