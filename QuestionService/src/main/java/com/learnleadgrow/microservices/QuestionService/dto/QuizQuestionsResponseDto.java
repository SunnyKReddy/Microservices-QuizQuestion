package com.learnleadgrow.microservices.QuestionService.dto;


import com.learnleadgrow.microservices.QuestionService.model.Question;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuizQuestionsResponseDto {
    private List<Question> quizQuestionsList;
}
