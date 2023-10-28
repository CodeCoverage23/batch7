package com.maven.hibernate.hibenateMavenProject;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

	private String Course;
	private String duration;
	public Certificate(String course, String duration) {
		Course = course;
		this.duration = duration;
	}
	public Certificate() {
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Certificate [Course=" + Course + ", duration=" + duration + "]";
	}
	
	
}
