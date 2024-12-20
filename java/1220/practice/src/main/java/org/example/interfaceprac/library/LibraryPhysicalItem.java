package org.example.interfaceprac.library;

public abstract class LibraryPhysicalItem extends LibraryItem{
    String location;

    public LibraryPhysicalItem(String title, int ID, String location) {
        super(title, ID);
        this.location = location;
    }

    abstract void findLocation();
}
