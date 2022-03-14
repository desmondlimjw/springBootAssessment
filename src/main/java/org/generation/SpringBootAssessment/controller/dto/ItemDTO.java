package org.generation.SpringBootAssessment.controller.dto;

//ItemDTO is not an entity class, not for mapping with database table and columns
//DTO refers to Data Transfer Object.
//Role of this class is to transfer data (object) from client to service layer (and vice versa) through controller
// The ItemDTO Class will interface with the Client (Browser) for any HTTP request (e.g. GET, POST, PUT, DELETE
// methods) and wired to the ItemService Class to perform getItem, addItem, findItem, updateItem and deleteItem.


import java.time.LocalDate;

public class ItemDTO {

    //fields
    private String title;
    private String description;
    private LocalDate targetDate;

    //constructor
    public ItemDTO(String title, String description, LocalDate targetDate) {
        this.title = title;
        this.description = description;
        this.targetDate = targetDate;
    }

    //Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }
}
