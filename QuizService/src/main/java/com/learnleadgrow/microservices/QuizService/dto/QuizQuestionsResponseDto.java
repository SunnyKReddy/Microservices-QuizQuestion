package com.learnleadgrow.microservices.QuizService.dto;

import com.learnleadgrow.microservices.QuizService.model.Question;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuizQuestionsResponseDto {
    private List<Question> quizQuestionsList;
}
