package SDA;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.lineSeparator;

public class SaveBookList {
    private static String wczytane;
    private static BookService bookService;
//todo: jak na razie nie nadpisuje  pliku tylko kasuje wewnatrz i zapisuje nowa

//    FileWriter file = new FileWriter("plik.txt", true);
//  BufferedWriter out = new BufferedWriter(file);
//  out.write("Dodaje do pliku");
//  out.close();
//
// static {
//        try {
//            bookService = new BookService();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    static String filePatch = "C:\\Users\\Astro\\IdeaProjects\\Księgarnia\\resources\\resources.txt";
    File file = new File(filePatch);
    FileWriter fileWriter = null;
    BufferedReader fileReader = null;
    public static List <Book> bookslist = new ArrayList <Book>();
    //private File filePath;
    //String tablicaStringow []  =new tablicaStringow[10];
    //BookService bookService = new BookService();
    //String wczytane;

    public void SaveBookList() throws IOException {
        loadFile();
        //bookService.bookslist.clear();
        System.out.println("Wczytałem" +wczytane);
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


            fileWriter = new FileWriter(filePatch,true);
            //for (int i = 0; i < bookService.bookslist.size(); i++) {
                //tablicaStringow= String[].valueOf( bookService.bookslist.get(i));
                String temp = new String(String.valueOf(bookService.bookslist));
                System.out.println("Zapisałem " + temp);



                fileWriter.write(new String(String.valueOf(bookService.bookslist)));
                fileWriter.write(lineSeparator());



        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }

    public void loadFile() throws IOException {

        try {
       BufferedReader lineReader = new BufferedReader(new FileReader(filePatch));
        String lineText = null;
wczytane = lineText;
        while ((wczytane = lineReader.readLine()) != null) {
            System.out.println(wczytane);
        }

        lineReader.close();
    } catch (IOException ex) {
       System.err.println(ex);
    }
//        try {
//            fileReader = new BufferedReader(new FileReader(filePatch));
//            String someFromeLine = fileReader.readLine();
//            this.wczytane = (someFromeLine);
//            //System.out.println("wczytane :"+wczytane);
//               bookService.bookslist.add(wczytane) ;
//               } finally {
//            if (fileReader != null) {
//                fileReader.close();
//            }


        return;
    }
//
//
//try {
//        BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
//        String lineText = null;
//
//        while ((lineText = lineReader.readLine()) != null) {
//            System.out.println(lineText);
//        }
//
//        lineReader.close();
//    } catch (IOException ex) {
//        System.err.println(ex);
//    }




    //*********************************
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