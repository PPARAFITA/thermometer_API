package com.sqa.thermometer.model;

import com.sqa.thermometer.dto.AnswerDTO;
import com.sqa.thermometer.repository.AnswerRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answerId;
    private Integer surveyId;
    private Integer questionId;

    public Answer(AnswerDTO answerDTO){
        this.answerId = answerDTO.getAnswerId();
        this.surveyId = answerDTO.getSurveyId();
        this.questionId = answerDTO.getQuestionId();
    }
}
