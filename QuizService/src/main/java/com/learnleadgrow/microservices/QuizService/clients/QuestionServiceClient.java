package com.learnleadgrow.microservices.QuizService.clients;

import com.learnleadgrow.microservices.QuizService.model.Question;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:8200", value = "QuestionServiceClient")
@FeignClient(name = "questionservice")
public interface QuestionServiceClient {
    @GetMapping("/question/quiz/{id}")
    @LoadBalanced
    List<Question> getAllQuestionsOfQuiz(@PathVariable Long id);
}
