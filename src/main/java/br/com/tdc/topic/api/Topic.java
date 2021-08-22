package br.com.tdc.topic.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private Integer id;
	
	private String content;
	
	private String subject;
	
	public Topic() {
	}
	
	public Topic(String content, String subject) {
		this.setContent(content);
		this.setSubject(subject);
	}
	
	public Integer getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

}
