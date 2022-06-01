package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import com.sun.istack.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public final class Item {

    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item() {
    }

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() { return id; }

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() { return invoice; }

    @Column(name = "PRICE")
    public BigDecimal getPrice() { return price; }

    @Column(name = "QUANTITY")
    public int getQuantity() { return quantity; }

    @Column(name = "VALUE")
    public BigDecimal getValue() { return value; }

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() { return product; }

    public void setId(int id) { this.id = id; }

    public void setInvoice(Invoice invoice) { this.invoice = invoice; }

    public void setProduct(Product product) { this.product = product; }

    public void setPrice(BigDecimal price) { this.price = price; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void setValue(BigDecimal value) { this.value = value; }
}
