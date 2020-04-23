package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
   public static void main(String[] args) {

       BookManager bookManager = new BookManager();

       Book book1 = bookManager.createBook("title1", "author1");
       Book book2 = bookManager.createBook("title2", "author2");
       Book book3 = bookManager.createBook("title3", "author3");
       Book book4 = bookManager.createBook("title1", "author1");

       System.out.println(book1 == book2);
       System.out.println(book3 == book2);
       System.out.println(book1 == book4);
       System.out.println(book4);
   }
}
