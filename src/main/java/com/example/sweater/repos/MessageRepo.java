package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


// contains all methods to processing db entities
public interface MessageRepo extends CrudRepository<Message, Integer> {
    List<Message> findByTag(String tag);    // name is important!
}
