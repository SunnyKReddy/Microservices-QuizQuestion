package com.learnleadgrow.microservices.QuizService.service;

import com.learnleadgrow.microservices.QuizService.model.Quiz;
import com.learnleadgrow.microservices.QuizService.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizServiceImpl implements QuizService{

    private QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public List<Quiz> getAllQuizes() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz getQuiz(Long id) {
        Optional<Quiz> savedQuiz = quizRepository.findById(id);
        return savedQuiz.get();
    }

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }
}
