package com.bicjo.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.bicjo.boot.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
