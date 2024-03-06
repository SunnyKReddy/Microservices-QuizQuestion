package com.learnleadgrow.microservices.QuestionService.repository;

import com.learnleadgrow.microservices.QuestionService.model.Question;
import lombok.Lombok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsRepository extends JpaRepository<Question, Long> {
    List<Question> findAllByQuizId(Long quizId);
}
