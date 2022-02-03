package com.example.apicompfuture.repository;

import com.example.apicompfuture.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
