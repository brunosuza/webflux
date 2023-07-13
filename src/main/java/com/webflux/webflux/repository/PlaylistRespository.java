package com.webflux.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.webflux.webflux.document.Playlist;

public interface PlaylistRespository extends ReactiveMongoRepository<Playlist, String>{

}