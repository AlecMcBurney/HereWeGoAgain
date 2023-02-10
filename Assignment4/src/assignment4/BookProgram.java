/*
 * Mackenzie Alec McBurney
 * 2023/02/08
 * Assignment 4 Part 4
 * 
 * Implement a Program class and inside its main method, read the information of a book from the input and
 * then use different methods of the Book class defined in Question 3.
 */
package assignment4;

import javax.swing.JOptionPane;

/**
 * A program that uses the methods from the Book class.
 *
 * @author kyure
 */
public class BookProgram {

    public static void main(String[] args) {
        /*
        Variables for info about a book.
        A string to be checked if it's within the title.
        */
        String title;
        String author;
        String strPages;
        String strPubYear;
        String strPrice;
        String check;
        int pages;
        int pubYear;
        float price;

        // Prompt user for information about a book.
        title = JOptionPane.showInputDialog("Enter title: ");
        author = JOptionPane.showInputDialog("Enter author or authors. (Seperate multiple with commas): ");
        strPages = JOptionPane.showInputDialog("Enter number of pages: ");
        strPubYear = JOptionPane.showInputDialog("Enter year of publication: ");
        strPrice = JOptionPane.showInputDialog("Enter pricce: $");

        // Convert strings into their primative data types.
        pages = Integer.parseInt(strPages);
        pubYear = Integer.parseInt(strPubYear);
        price = Float.parseFloat(strPrice);

        // Initialize and call the Book constructor for the new Book object.
        Book hardCover = new Book(title, author, pages, pubYear, price);
        System.out.println(hardCover.getTitleInTitleCase());

        // Prompt user for a string to search for within the title(Case sensitive)
        check = JOptionPane.showInputDialog("Search title for: ");
        System.out.println(hardCover.contains(check));
        hardCover.printAuthors();
    }
}
// alec_mcburney@gmail.com carl@gmail.com;harold@outlook.com