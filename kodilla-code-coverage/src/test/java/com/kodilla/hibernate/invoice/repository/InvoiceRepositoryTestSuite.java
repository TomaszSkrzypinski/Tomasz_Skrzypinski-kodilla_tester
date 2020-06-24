//package com.kodilla.hibernate.invoice.repository;
//
//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.Assert;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.math.BigDecimal;
//
//public class InvoiceRepositoryTestSuite {
//
//    @Autowired
//    private InvoiceRepository invoiceRepository;
//
//    @Test
//    public void testInvoiceRepositorySave() {
//        //Given
//        Product product1 = new Product("product1");
//        BigDecimal big1 = new BigDecimal(50);
//        BigDecimal big2 = new BigDecimal(150);
//        Item item1 = new Item(product1, big1, 3, big2 );
//
//        Product product2 = new Product("product2");
//        BigDecimal big3 = new BigDecimal(50);
//        BigDecimal big4 = new BigDecimal(200);
//        Item item2 = new Item(product2, big3, 4, big4 );
//
//        Product product3 = new Product("product3");
//        BigDecimal big5 = new BigDecimal(35);
//        BigDecimal big6 = new BigDecimal(70);
//        Item item3 = new Item(product3, big5, 2, big6 );
//
//        Invoice invoice = new Invoice("0026");
//
//        invoice.getItems().add(item1);
//        invoice.getItems().add(item2);
//        invoice.getItems().add(item3);
//
//        //When
//        invoiceRepository.save(invoice);
//        int invoiceId = invoice.getId();
//
//        //Then
//        Assert.assertNotEquals(0, invoiceId);
//
//        // CleanUp
//        try {
//            invoiceRepository.deleteById(invoiceId);
//        } catch (Exception e) {
//            //do nothing
//        }
//    }
//}