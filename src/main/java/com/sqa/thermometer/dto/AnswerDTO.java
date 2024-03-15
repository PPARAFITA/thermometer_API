package com.sqa.thermometer.dto;

import com.sqa.thermometer.model.Answer;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.objenesis.instantiator.android.AndroidSerializationInstantiator;

@Data
@NoArgsConstructor
public class AnswerDTO {
    private Integer answerId;
    private Integer surveyId;
    private Integer questionId;

    public AnswerDTO(Answer answer){
        this.answerId = answer.getAnswerId();
        this.questionId = answer.getQuestionId();
        this.surveyId = answer.getSurveyId();
    }
}
