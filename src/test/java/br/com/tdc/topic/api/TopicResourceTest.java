package br.com.tdc.topic.api;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class TopicResourceTest {
	
	@Autowired
	private TopicResource resource;
	
	@Test
	public void testCadastrar() {
		Topic topic = new Topic("teste content", "teste subject");
		ResponseEntity<Topic> cadastrar = resource.cadastrar(topic);
		Assert.assertNotNull(cadastrar.getBody());
		Assert.assertEquals(cadastrar.getBody().getId(), new Integer(1));
	}
	
	
}
