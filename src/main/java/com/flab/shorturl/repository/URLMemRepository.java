package com.flab.shorturl.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.flab.shorturl.domain.URLEntity;

@Repository
public class URLMemRepository implements URLRepository {
	private static List<URLEntity> repository = new ArrayList<>();

	@Override
	public URLEntity save(String url) {
		repository.add(new URLEntity(url, url));
		return null;
	}

	@Override
	public URLEntity findById(String url) {
		return repository.stream().filter(urlEntity -> url.equals(urlEntity.getUrl()))
			.findAny().orElse(null);
	}
}
