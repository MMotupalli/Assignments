package com.cg.web;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entity.Emp;
import com.cg.entity.Question;
import com.cg.service.EmpService;
import com.cg.service.IQuizSer;
import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

@Controller
public class QuizController {

	@Autowired
	private IQuizSer ser;

	@RequestMapping("startquiz.htm")
	public String processEmpbyId(Model  model) {
		model.addAttribute("qlist", ser.getQuestions());
		return "Quizfrm";
	}

	@RequestMapping("finishquiz.htm")
	public String result(@RequestBody MultiValueMap<String, String> formData, Model model) {
		int score = 0;
		Set<String> key = formData.keySet();
		for (String id : key) {
			Question ques = ser.getQuestion(Integer.parseInt(id));
			List<String> value = formData.get(id);
			for (String userAnswer : value) {
				if(userAnswer != null && ques.getAnswer().equals(userAnswer)) ++score;
			}
		}
		double per = score / 8.0 *100;
		model.addAttribute("score", score);
		model.addAttribute("percentage", per);
		return "QuizView";
	}
}
