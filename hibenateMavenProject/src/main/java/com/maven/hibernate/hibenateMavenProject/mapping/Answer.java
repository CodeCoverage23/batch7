package com.maven.hibernate.hibenateMavenProject.mapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Answer_table")
public class Answer {
   
	@Id
	@Column(name="Answer_Id")
	private int ansId;
	
    @Column(name="Answer")
	private String answer;
	@ManyToMany
   private List<Question> questions;

	private Question question;
	public Answer(int ansId, String answer, Question question) {
		super();
		this.ansId = ansId;
		this.answer = answer;
		this.question = question;
	}

	public Answer() {
		// TODO Auto-generated constructor stub
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", answer=" + answer + ", question=" + question + "]";
	}
	
	
}
