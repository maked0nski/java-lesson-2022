package homework.hw_2.pc;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book());
        printables.add(new Magazine());

        Book book1 = new Book();
        Magazine magazine1 = new Magazine();
        printables.add(book1);
        printables.add(magazine1);
    }
}

class PC {}

class Laptop extends PC {}

class Ultrabook extends Laptop {}

class Workstation extends Laptop {}

interface Printable{
    void print();
}

class Book implements Printable{
    @Override
    public void print() {

    }
}

class Magazine implements Printable{
    @Override
    public void print() {

    }
}