package org.example.interfaceprac.library;

public abstract class LibraryItem {
    protected String title;
    protected String id;
    protected boolean borrow;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
        this.borrow = true;
    }

    public abstract void bookBorrow();

    public abstract void bookDue();
}
