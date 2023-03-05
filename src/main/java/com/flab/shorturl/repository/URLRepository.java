package com.flab.shorturl.repository;

import com.flab.shorturl.domain.URLEntity;

public interface URLRepository {
	URLEntity save(String url);
	URLEntity findById(String url);
}
