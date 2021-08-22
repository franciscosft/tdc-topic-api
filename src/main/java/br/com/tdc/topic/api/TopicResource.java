package br.com.tdc.topic.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/topic")
public class TopicResource {
	
	@Autowired
	private TopicService service;
	
	@PostMapping
	public void cadastrar(@RequestBody Topic topic) {
		service.cadastrar(topic);
	}
	
	@GetMapping
	public ResponseEntity<List<Topic>> buscar(){
		List<Topic> buscarTopics = service.buscarTopics();
		return new ResponseEntity<>(buscarTopics, HttpStatus.OK);
	}
	

}
