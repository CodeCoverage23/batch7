package com.maven.hibernate.hibenateMavenProject.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
	System.out.println("Application Started");
		Configuration cfg = new Configuration();
        cfg.configure("com/maven/hibernate/hibenateMavenProject/mapping/hibernate.cfg.xml");
        SessionFactory factory1 = cfg.buildSessionFactory();
        System.out.println(factory1);
        Session session = factory1.openSession();
		Transaction beginTransaction = session.beginTransaction();
		
		Question question = new Question();
		question.setqId(1122);
		question.setQuestion("what is java?");
		
		
		Answer answer = new Answer();
		answer.setAnsId(1221);
		answer.setAnswer("java is a programming language");
		answer.setQuestion(question);
		
		Answer answer1 = new Answer();
		answer1.setAnsId(1222);
		answer1.setAnswer("java is a oops langauge");
		answer1.setQuestion(question);
		
		Answer answer5 = new Answer();
		answer5.setAnsId(12050);
		answer5.setAnswer("java is deeloped by sun microsystem in 1995");
		answer5.setQuestion(question);
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(answer);
		list.add(answer1);
		list.add(answer5);
		question.setAns(list);
//		  
//		session.save(answer);
//		session.save(answer1);
//		session.save(answer5);
//		session.save(question);
		
		session.get(Question.class, 1122);
		System.out.println(question.getQuestion());
		for(Answer a : list) {
			
			System.out.println(a.getAnswer());
		}
		
		
		beginTransaction.commit();
        session.close();
        factory1.close();
	}

}
