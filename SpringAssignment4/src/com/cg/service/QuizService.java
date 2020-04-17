package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.entity.Emp;
import com.cg.entity.Question;

@Service
public class QuizService implements IQuizSer {

	@Autowired
	@Qualifier("qbean")
	public Map<Integer, Question> qmap;
	
	// IOC to inject DI
	public void setQmap(Map<Integer, Question> qmap) {
		this.qmap = qmap;
	}

	@Override
	public List<Question> getQuestions() {
		List<Question> lst = new ArrayList<>(qmap.values());
		return lst;
	}

	@Override
	public Question getQuestion(int id) {
		return qmap.get(id);
	}

}
