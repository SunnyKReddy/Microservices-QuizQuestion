package com.learnleadgrow.microservices.QuestionService.service;

import com.learnleadgrow.microservices.QuestionService.model.Question;
import com.learnleadgrow.microservices.QuestionService.repository.QuestionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionsRepository questionsRepository;

    public QuestionServiceImpl(QuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionsRepository.findAll();
    }

    @Override
    public Question getQuestion(Long id) {
        Optional<Question> question = questionsRepository.findById(id);
        return question.get();
    }

    @Override
    public Question createQuestion(Question question) {
        return questionsRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestionsByQuizId(Long quizId) {
        return  questionsRepository.findAllByQuizId(quizId);
    }
}
