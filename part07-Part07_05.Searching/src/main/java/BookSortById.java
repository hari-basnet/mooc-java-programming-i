
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class BookSortById implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return Integer.min(o1.getId(), o1.getId());
    }
    
}
