package com.springmongodbdocker.dao;

import com.springmongodbdocker.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
