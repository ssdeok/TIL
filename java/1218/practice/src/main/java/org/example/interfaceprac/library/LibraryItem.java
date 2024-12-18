package org.example.interfaceprac.library;

public abstract class LibraryItem implements Borrowable{
    String title;
    int ID;
    boolean isBorrowed;

    public LibraryItem(String title, int ID) {
        this.title = title;
        this.ID = ID;
        this.isBorrowed = false;
    }

}
