package com.careerdevs.hallwayProject.repositories;

import com.careerdevs.hallwayProject.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
