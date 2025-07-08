package com.fcsousadev.urlShortener.repository;

import com.fcsousadev.urlShortener.entities.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
