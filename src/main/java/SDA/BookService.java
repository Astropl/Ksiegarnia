package SDA;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*1. ID
2. Tytuł książki
3. Autor książki
4. Cena
5. Liczba sztuk w magazynie.
int id, numberOfItemsInStock;
        String TitleOFBook, author;
        double price;*/
public class BookService {
    public static List <Book> bookslist = new ArrayList <Book>();
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner((System.in));
    static SaveBookList saveBookList= new SaveBookList();;

    //static SaveBookList saveBookList


    private static String titleOFBook;
    private static String author;
    private static int id;
    private static int numberOfItemsInStock;
    private static double price;
    static Book book = new Book(id, titleOFBook, author, price, numberOfItemsInStock);

    public BookService() {
        Book book1 = new Book(1, "Cos", "King", 25, 0);
        bookslist.add(book1);

    }

    public static void addBooks() throws IOException {
        //
        id = 100;
        numberOfItemsInStock = 0;

        System.out.println("Dodaj nazwę ksiązki");
        titleOFBook = sc.nextLine();
        System.out.println("Dodaj autora ksiązki");
        author = sc1.nextLine();
        System.out.println("Dodaj cenę ksiązki");
        price = sc.nextDouble();

        book = new Book(id, titleOFBook, author, price, numberOfItemsInStock);
        bookslist.add(book);

        saveBookList.SaveBookList();

    }



//    public void addBooks(int id, String titleOFBook, String author, double price, int numberOfItemsInStock) {
//        BookService bookService = new BookService();
//        Book book1 = new Book();
//        book1 = ("1", "asa", "sff", "34", "0");
//        bookslist.add(book1);
//
//        return;
//    }


}


//Dodaj klasę BookService która będzie wykonywała operacje na imitacji bazy danych.
//Klasa ta niech posiada listę książek a następnie dodaj kilka metod:
//1. Dodawanie książek do bazy.
//2. Edycję liczby książek w magazynie.
//3. Edycję ceny książki