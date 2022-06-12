package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import com.sun.istack.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {

    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) { this.number = number; }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() { return id; }

    @NotNull
    @Column(name = "NUMBER")
    public String getNumber() { return number; }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() { return items; }

    public void setId(int id) { this.id = id; }

    public void setNumber(String number) { this.number = number; }

    public void setItems(List<Item> items) { this.items = items; }
}