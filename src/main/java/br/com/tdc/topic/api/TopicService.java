package br.com.tdc.topic.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository repository;
	
	public void cadastrar(Topic topic) {
		repository.save(topic);
	}

	public List<Topic> buscarTopics() {
		return repository.findAll();
	}

}
