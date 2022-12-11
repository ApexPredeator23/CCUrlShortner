package com.cc.Hash;

import java.nio.charset.StandardCharsets;
import com.google.common.hash.Hashing;

public class HashLogic {
	public static String getShortUrl(String url) {
		String shortUrl = Hashing.murmur3_32_fixed().hashString(url, StandardCharsets.UTF_8).toString();
		return shortUrl;
	}

}