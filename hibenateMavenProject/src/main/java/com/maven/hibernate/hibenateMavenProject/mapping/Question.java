package com.maven.hibernate.hibenateMavenProject.mapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Question_Table")
public class Question {

	
    @Id
    @Column(name="question_Id")
    private int qId;
	
	private String question;
    @ManyToMany
    private List<Answer> ans;

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}


	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	public Question() {
		super();
	}
	

	public Question(int qId, String question, List<Answer> ans) {
		super();
		this.qId = qId;
		this.question = question;
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [qId=" + qId + ", question=" + question + ", ans=" + ans + "]";
	}
	
	
}
