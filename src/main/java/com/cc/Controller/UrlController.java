package com.cc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cc.Entity.Url;
import com.cc.Service.UrlService;

@RestController
@RequestMapping("CCUrl")
public class UrlController {

	@Autowired
	private UrlService urlService;

	@GetMapping("/{shortUrl}")
	public String getOriginlUrl(@PathVariable String shortUrl) {
		return urlService.getOriginlUrl(shortUrl);
	}

	@PostMapping
	public Url generateShortUrl(@RequestBody String url) {
		return urlService.generateShortUrl(url);
	}

}
