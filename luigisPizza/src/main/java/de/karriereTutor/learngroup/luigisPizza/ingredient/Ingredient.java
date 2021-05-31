package de.karriereTutor.learngroup.luigisPizza.ingredient;

import javax.persistence.*;

//@Entity
//@Table
public class Ingredient {

//    @Id
//    @SequenceGenerator(
//            name = "ingredient_sequence",
//            sequenceName = "ingredient_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "ingredient_sequence"
//    )

    private double id;
    private String type;
    private String name;
    private String description;
    private double cost;

    public Ingredient() {
    }

    public Ingredient(double id, String type, String name, String description, double cost) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public Ingredient(String type, String name, String description, double cost) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
