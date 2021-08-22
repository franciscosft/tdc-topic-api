package br.com.tdc.topic.api;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicRepository extends JpaRepository<Topic, Integer> {
	
}
