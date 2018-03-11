package SDA;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.lineSeparator;

public class SaveBookList {
    private static  String wczytane;
    private static  BookService bookService;
    static String filePatch = "C:\\Users\\Astro\\IdeaProjects\\Księgarnia\\resources\\resources.txt";
    File file = new File(filePatch);
    FileWriter fileWriter = null;
    BufferedReader fileReader = null;
    List <Book> tempBooks = new ArrayList <Book>();
    String tablicaStringow []  =new tablicaStringow[10];
    //BookService bookService = new BookService();
    //String wczytane;

    public void SaveBookList() throws IOException {
        loadFile(wczytane);
        //bookService.bookslist.clear();

        saveFile();


    }

    public void saveFile() throws IOException {
        try {
            //rozbic stringi na klastry
//Book{id=1, TitleOFBook='Cos', author='King', price=25.0, numberOfItemsInStock=0}
//Book{id=100, TitleOFBook='dgdfgdfhg', author='hgfhgfhgf', price=76.0, numberOfItemsInStock=0}
//String tekst = "Ala:ma:kota:a:kot:ma:Ale";
//String wynik1[] = null;
//String wynik2[] = null;
//// Do tablicy wynik1 trafi zawartość zmiennej tekst
//// podzielona na elementy: Ala, ma, kota itd.
//wynik1 = tekst.split(":");
//// Do tablicy wynik2 trafi zawartość zmiennej tekst
//// podzielona na 2 elementy: Ala, ma:kota:a:kot:ma:Ale itd.
//wynik2 = tekst.split(":", 2);


            fileWriter = new FileWriter(filePatch);
            for (int i = 0; i < bookService.bookslist.size(); i++) {
                tablicaStringow= String[].valueOf( bookService.bookslist.get(i));

                fileWriter.write(new String(String.valueOf(bookService.bookslist.get(i))));
                fileWriter.write(lineSeparator());
            }


        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }

    public void loadFile(String wczytane) throws IOException {

        try {
            fileReader = new BufferedReader(new FileReader(filePatch));
            String someFromeLine = fileReader.readLine();
            this.wczytane = (someFromeLine);
            // Zesplitowac zmienna string wczytane
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }

        return;
    }
//for (int i = 0; i < bookService.bookslist.size(); i++) {
//            System.out.println(bookService.bookslist.get(i));
//        }


//String filePath = "/path/to/text/file.txt"
//        int number = 1234567;
//        FileWriter fileWriter = null;
//
//        try {
//            fileWriter = new FileWriter(filePath);
//            fileWriter.write(Integer.toString(number));
//        } finally {
//            if (fileWriter != null) {
//                fileWriter.close();
//            }
//        }


}
