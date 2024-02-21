package otmankarim.U5W3D3.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Getter
@Setter
public class Book implements BookElement {
    private double price;
    private Set<Author> authorList;
    private List<BookElement> bookElements = new ArrayList<>();

    public Book(double price, Set<Author> authorList) {
        this.price = price;
        this.authorList = authorList;
    }

    public void addBookElement(BookElement el) {
        bookElements.add(el);
    }

    @Override
    public int getPagesNumber() {
        int pagesNumber = 0;
        for (BookElement el : bookElements) {
            pagesNumber += el.getPagesNumber();
        }
        return pagesNumber;
    }

    @Override
    public void print() {
        for (BookElement el : bookElements) {
            el.print();
        }
    }
}
