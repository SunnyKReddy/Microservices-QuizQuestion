package com.learnleadgrow.microservices.QuizService.model;

import lombok.Data;

@Data
public class Question {
    private Long Id;
    private String question_name;
}
