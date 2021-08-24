package br.com.tdc.topic.api;

public class TopicDTO {
	
	private String subject;
	
	private String content;
	
	public TopicDTO(String content, String subject) {
		this.setContent(content);
		this.setSubject(subject);
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

	public Topic toEntity() {
		return new Topic(this.content, this.subject);
	}
	
}
