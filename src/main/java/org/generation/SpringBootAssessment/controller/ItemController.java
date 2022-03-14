package org.generation.SpringBootAssessment.controller;

import org.generation.SpringBootAssessment.controller.dto.ItemDTO;
import org.generation.SpringBootAssessment.repository.entity.Item;
import org.generation.SpringBootAssessment.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
@RequestMapping("/item")
public class ItemController {

    //Mapping the API calls from the client to the respective methods (endpoint) to handle the HTTP request call (GET,
    // POST, PUT, DELETE)

    //How to handle the HTTP request from the client - Controller class Object is dependent on the ItemServiceMySQL
    // Class object (Dependency injection)

    private final ItemService itemService;

    public ItemController(@Autowired ItemService itemService) {
        this.itemService = itemService;
    }


    //1. Client sends a GET HTTP Request to the Controller through the REST API
    @CrossOrigin
    @GetMapping( "/all" )
    public Iterable<Item> getItems()
    {
        return itemService.all();
    }

    //2. Client sends a GET HTTP request with the item ID to the controller via the REST API
    @CrossOrigin
    @GetMapping("/{id}") //parameter variable that is passed in by the front end
    public Item findItemById(@PathVariable Integer id)
    {
        return itemService.findById(id);
    }


    //TODO - Implement POST Method (Error 400 bad request)
    //3. Client sends a POST HTTP request with all the item data (title, description, targetDate)
    @CrossOrigin
    @PostMapping("/add")
    public void save(@RequestParam(name="title", required = true) String title,
                     @RequestParam(name="description", required = true) String description,
                     @RequestParam(name="targetDate", required = true)
                                   @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate targetDate) {

        //Create an instance object of the ItemDTO to store all the data that is sent from the Client
        ItemDTO itemDto = new ItemDTO(title, description, targetDate);
        itemService.save(new Item(itemDto));
    }
}
