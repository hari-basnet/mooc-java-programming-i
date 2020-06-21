/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class Book {
    private String title;
    private int numberOfPages;
    private int pblYear;

    public Book(String title, int numberOfPages, int pbYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.pblYear = pbYear;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPbYear() {
        return pblYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPbYear(int pbYear) {
        this.pblYear = pbYear;
    }
    
    @Override
    public String toString(){
        return this.title + ", " + this.numberOfPages + " pages, " + this.pblYear;
    }
}
