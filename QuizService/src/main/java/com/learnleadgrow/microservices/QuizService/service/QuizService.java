package com.learnleadgrow.microservices.QuizService.service;

import com.learnleadgrow.microservices.QuizService.model.Quiz;

import java.util.List;

public interface QuizService {
    public List<Quiz> getAllQuizes();
    public Quiz getQuiz(Long id);
    public Quiz createQuiz(Quiz quiz);
}
