package SDA;


import java.io.IOException;
import java.util.Scanner;

//import static SDA.SaveBookList.wczytane;

public class App {
    static BookService bookService = new BookService();
    static SaveBookList saveBookList = new SaveBookList();
    static Menu menu = new Menu();
    static Scanner sc = new Scanner(System.in);
    static int choice;
    static String wczytane;

    public static void main(String[] args) throws IOException {

        choiceMenu();
        //showBook();

    }

    public static void choiceMenu() throws IOException {
        menu.menu();
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("wybrałes 1");
                    showBook();
                    choiceMenu();
                    break;
                case 2:
                    System.out.println("Wybrałes 2");
                    choiceMenu();
                    break;
                case 3:
                    System.out.println("Wybrałes 3");
                    choiceMenu();
                    break;
                case 4:
                    System.out.println("Wybrałes 4");
                    bookService.addBooks();
                    choiceMenu();
                    break;
                case 0:
                    System.out.println("Wybrałes 0. Koniec");
                    break;
            }

        } while (choice != 0);
        System.out.println("koniec");
    }

    //    switch ({wyrażenie wyboru}) {
//        case {wartość wyboru}:
//        {ciąg instrukcji dla danego wariantu}
//
//        case {inna wartość wyboru}:
//        {ciąg instrukcji dla danego wariantu}
//
//        default:
//        {ciąg instrukcji dla wariantu domyślnego}
//    }


    public static void showBook() throws IOException {
        saveBookList.loadFile();
        for (int i = 0; i < BookService.bookslist.size(); i++) {
            System.out.println(bookService.bookslist.get(i));
        }
    }
}
//Firma SDA prowadzi księgarnię internetową. Zostałeś(aś) poproszony o dodanie
//nowej funkcjonalności.
//Twoim zadaniem jest napisanie programu, który będzie reprezentował fragment
//sklepu odpowiedzialny za wykonywanie zakupów.
//Utwórz klasę reprezentującą książkę o nazwie Book. Dla ułatwienia przyjmijmy
//że książka na początku posiada tylko kilka parametrów:
//1. ID
//2. Tytuł książki
//3. Autor książki
//4. Cena
//5. Liczba sztuk w magazynie.