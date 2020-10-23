package dmacc.repository;

import org.springframework.data.repository.CrudRepository;

import dmacc.beans.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
