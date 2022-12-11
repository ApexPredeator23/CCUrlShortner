package com.cc.Service;

import com.cc.Entity.*;
import com.cc.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.cc.Hash.HashLogic.getShortUrl;

@Service
public class UrlService {
	@Autowired
	private UrlRepository urlRepository;

	public String getOriginlUrl(String id) {
		return urlRepository.findByShortUrl(id);
	}

	public Url generateShortUrl(String url) {
		Url urlObject = new Url();
		urlObject.setOriginalurl(url);
		urlObject.setShorturl(getShortUrl(url));

		return urlRepository.save(urlObject);
	}
}
