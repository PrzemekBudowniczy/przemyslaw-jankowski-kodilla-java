package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;
    private static final String INVOICENUMBER = "2022.1";
    private static final String PRODUCTNAME1 = "mouse";
    private static final String PRODUCTNAME2 = "keyboard";
    private static final String PRODUCTNAME3 = "headset";

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(25.1), 2, new BigDecimal(50.2));
        Item item2 = new Item(new BigDecimal(5), 1, new BigDecimal(10));
        Item item3 = new Item(new BigDecimal(10.5), 3, new BigDecimal(31.5));

        Product product1 = new Product(PRODUCTNAME1);
        Product product2 = new Product(PRODUCTNAME2);
        Product product3 = new Product(PRODUCTNAME3);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        Invoice invoice = new Invoice(INVOICENUMBER);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(product1);
        int product1Id = product1.getId();
        productDao.save(product2);
        int product2Id = product2.getId();
        productDao.save(product3);
        int product3Id = product3.getId();
        itemDao.save(item1);
        int item1ID = item1.getId();
        itemDao.save(item2);
        int item2ID = item2.getId();
        itemDao.save(item3);
        int item3ID = item3.getId();
        invoiceDao.save(invoice);
        int invoiceID = invoice.getId();

        //Then
        assertEquals(3, invoice.getItems().size());
        assertEquals("2022.1", invoice.getNumber());

        BigDecimal result = BigDecimal.valueOf(0);
        for(int i=0; i<3; i++) {
            result = result.add(invoice.getItems().get(i).getValue());
        }
        assertEquals(BigDecimal.valueOf(92), result.setScale(0, RoundingMode.CEILING));

        //CleanUp
//        productDao.deleteById(product1Id);
//        productDao.deleteById(product2Id);
//        productDao.deleteById(product3Id);
//        itemDao.deleteById(item1ID);
//        itemDao.deleteById(item2ID);
//        itemDao.deleteById(item3ID);
        invoiceDao.deleteById(invoiceID);
    }
}
