package com.start.reviewing.endpoint.repository;


import com.start.reviewing.endpoint.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}