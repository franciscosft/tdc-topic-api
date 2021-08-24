package br.com.tdc.topic.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository repository;
	
	public Topic cadastrar(Topic topic) {
		return repository.save(topic);
	}

	public List<Topic> buscarTopics() {
		return repository.findAll();
	}

	public Topic atualizar(Integer id, Topic topic) throws Exception {
		Optional<Topic> findById = repository.findById(id);
		if (findById.isPresent()) {
			Topic topicParaSalvar = findById.get();
			topicParaSalvar.setContent(topic.getContent());
			topicParaSalvar.setSubject(topic.getSubject());
			return repository.save(topicParaSalvar);
		}
		throw new Exception("Topic não encontrado");
	}

}
