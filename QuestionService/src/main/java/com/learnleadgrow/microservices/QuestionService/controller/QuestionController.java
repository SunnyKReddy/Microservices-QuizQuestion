package com.learnleadgrow.microservices.QuestionService.controller;

import com.learnleadgrow.microservices.QuestionService.dto.QuizQuestionsResponseDto;
import com.learnleadgrow.microservices.QuestionService.model.Question;
import com.learnleadgrow.microservices.QuestionService.service.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{id}")
    public Question getQuestion(@PathVariable Long id) {
        return questionService.getQuestion(id);
    }

    @GetMapping("/quiz/{id}")
    public ResponseEntity<List<Question>> getQuestionsByQuizId(@PathVariable Long id) {
//        QuizQuestionsResponseDto quizQuestionsResponseDto = new QuizQuestionsResponseDto();
//        quizQuestionsResponseDto.setQuizQuestionsList(questionService.getAllQuestionsByQuizId(id));
//        return quizQuestionsResponseDto;
        return new ResponseEntity<>(questionService.getAllQuestionsByQuizId(id), HttpStatus.OK);
    }

    @PostMapping
    public Question createQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }



}
