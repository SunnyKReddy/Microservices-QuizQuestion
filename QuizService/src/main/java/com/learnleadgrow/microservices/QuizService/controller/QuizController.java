package com.learnleadgrow.microservices.QuizService.controller;

import com.learnleadgrow.microservices.QuizService.clients.QuestionServiceClient;
import com.learnleadgrow.microservices.QuizService.model.Question;
import com.learnleadgrow.microservices.QuizService.model.Quiz;
import com.learnleadgrow.microservices.QuizService.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private QuizService quizService;
    private QuestionServiceClient questionServiceClient;

    private RestTemplate restTemplate;

    public QuizController(QuizService quizService, QuestionServiceClient questionServiceClient ,RestTemplate restTemplate) {
        this.quizService = quizService;
        this.questionServiceClient = questionServiceClient;
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public List<Quiz> getAllQuizes() {
        return quizService.getAllQuizes();
    }

    @GetMapping("/{id}")
    public Quiz getQuiz(@PathVariable Long id) {
        return quizService.getQuiz(id);
    }

    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizService.createQuiz(quiz);
    }

    @GetMapping("/start/{id}")
    public Quiz startQuiz(@PathVariable Long id) {
        Quiz quiz = quizService.getQuiz(id);
        // Getting questions of a quiz using question service via OpenFeign Client
        // Quiz Service calling Question Service (Http Communication)
        List<Question> quizQuestionsList = questionServiceClient.getAllQuestionsOfQuiz(id);
        quiz.setQuestions(quizQuestionsList);
        //ResponseEntity<List> response = restTemplate.getForEntity("http://mskousikreddy/question/quiz/" + id, List.class);
        //quiz.setQuestions(response.getBody());
        return quiz;
    }
}
