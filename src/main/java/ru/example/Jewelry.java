package ru.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jewelry_store")
public class Jewelry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;          // Название изделия
    private String material;      // Материал изделия
    private String description;   // Описание изделия
    private double weight;        // Вес изделия
    private double price;         // Цена изделия

    public Jewelry() {}

    public Jewelry(String name, String material, String description, double weight, double price) {
        this.name = name;
        this.material = material;
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getMaterial() { return material; }
    public String getDescription() { return description; }
    public double getWeight() { return weight; }
    public double getPrice() { return price; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setMaterial(String material) { this.material = material; }
    public void setDescription(String description) { this.description = description; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Украшение [id=" + id + ", название=" + name + ", материал=" + material +
                ", описание=" + description + ", вес=" + weight + ", цена=" + price + "]";
    }
}
