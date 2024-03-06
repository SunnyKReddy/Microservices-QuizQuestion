package com.learnleadgrow.microservices.QuestionService.service;

import com.learnleadgrow.microservices.QuestionService.model.Question;

import java.util.List;

public interface QuestionService {
    public List<Question> getAllQuestions();
    public Question getQuestion(Long id);
    public Question createQuestion(Question question);
    public List<Question> getAllQuestionsByQuizId(Long quizId);
}
