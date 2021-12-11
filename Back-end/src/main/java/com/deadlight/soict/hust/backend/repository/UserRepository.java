package com.deadlight.soict.hust.backend.repository;

import com.deadlight.soict.hust.backend.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
