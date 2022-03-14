package org.generation.SpringBootAssessment.service;

import org.generation.SpringBootAssessment.repository.entity.Item;
import java.util.List;

public interface ItemService {

    //save method is for 2 purposes - Create new item & Update existing item
    Item save(Item item);

    //Read all item from database
    List<Item> all();

    //Read an item from database - based on item Id
    Item findById(int itemId);

}
