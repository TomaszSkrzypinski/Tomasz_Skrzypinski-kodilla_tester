package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item item0 = new Item("item0", 25);
    Item item1 = new Item("item1", 30);
    Item item2 = new Item("item2", 35);

    @Test
    public void checkCorrectItemsSize(){
       //When
        int expected = invoice.getSize();

        //Then
        assertEquals(3, expected);
    }

    @Test
    public void checkCorrectAddItemsToItemsList() {
        //When
        Item result = invoice.getItem(2);

        //Then
        assertEquals("item2", result.getName());
        assertEquals(35, result.getPrice());
    }

    @Test
    public void checkGetItemsOfNegativIndex() {
        //Then
        assertNull(invoice.getItem(-2));
    }

    @Test
    public void checkGetItemsOfToBigNumberPosition() {
        //Then
        assertNull(invoice.getItem(12));
    }

    @Test
    public void checkClearMethodWorkingCorrect() {
        //When
        invoice.clear();

        //Then
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(item0);
        invoice.addItem(item1);
        invoice.addItem(item2);
    }

    @AfterEach
    public void resetValius() {
        System.out.println("Reseting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByMessage() {
        System.out.println("Finishing testing");
    }
}

