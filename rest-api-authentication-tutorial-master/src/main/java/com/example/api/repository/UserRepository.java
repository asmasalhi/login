package com.example.api.repository;

import com.example.api.model.User;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, String> {

    User findUserByUsername(String username);
}
