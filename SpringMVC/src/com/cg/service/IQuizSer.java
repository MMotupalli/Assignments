package com.cg.service;

import java.util.List;

import com.cg.entity.Question;

public interface IQuizSer {
	
	List<Question> getQuestions();
	Question getQuestion(int id);

}
