package com.cg.entity;

public class Question {
	
	private String qid;
	private String qdesc;
	private String opta;
	private String optb;
	private String optc;
	private String answer;
	
	public Question(String qid, String qdesc, String opta, String optb, String optc, String answer) {
		super();
		this.qid = qid;
		this.qdesc = qdesc;
		this.opta = opta;
		this.optb = optb;
		this.optc = optc;
		this.answer = answer;
	}

	public String getQid() {
		return qid;
	}

	public String getQdesc() {
		return qdesc;
	}

	public String getOpta() {
		return opta;
	}

	public String getOptb() {
		return optb;
	}

	public String getOptc() {
		return optc;
	}

	public String getAnswer() {
		return answer;
	}

}
