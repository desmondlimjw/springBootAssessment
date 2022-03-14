package org.generation.SpringBootAssessment.repository;

import org.springframework.data.repository.CrudRepository;
import org.generation.SpringBootAssessment.repository.entity.Item;

public interface ItemRepository extends CrudRepository<Item, Integer>{

}
