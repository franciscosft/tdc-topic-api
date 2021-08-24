package br.com.tdc.topic.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/topic")
public class TopicResource {
	
	@Autowired
	private TopicService service;
	
	@PostMapping
	public ResponseEntity<Topic> cadastrar(@RequestBody Topic topic) {
		Topic cadastro = service.cadastrar(topic);
		return new ResponseEntity<Topic>(cadastro, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Topic> atualizar(@RequestHeader Integer id, @RequestBody Topic topic) {
		Topic cadastro;
		try {
			cadastro = service.atualizar(id, topic);
			return new ResponseEntity<Topic>(cadastro, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping
	public ResponseEntity<List<Topic>> buscar(){
		List<Topic> buscarTopics = service.buscarTopics();
		return new ResponseEntity<>(buscarTopics, HttpStatus.OK);
	}
	

}
