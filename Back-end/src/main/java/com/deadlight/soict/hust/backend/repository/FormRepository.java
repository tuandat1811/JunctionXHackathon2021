package com.deadlight.soict.hust.backend.repository;

import com.deadlight.soict.hust.backend.entities.Forms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<Forms, Integer> {
}
