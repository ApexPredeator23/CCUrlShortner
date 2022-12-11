package com.cc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cc.Entity.Url;

public interface UrlRepository extends JpaRepository<Url, Long> {

	@Query(value = "select originalurl from Url where shorturl = ?1", nativeQuery = true)
	String findByShortUrl(String id);
}