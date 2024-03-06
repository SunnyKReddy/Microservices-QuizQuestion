package com.learnleadgrow.microservices.QuizService.repository;

import com.learnleadgrow.microservices.QuizService.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
