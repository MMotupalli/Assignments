package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cg.entity.Emp;
import com.cg.entity.Question;

//@Service
public class QuizService implements IQuizSer {

	//	@Autowired
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
