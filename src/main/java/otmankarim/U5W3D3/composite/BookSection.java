package otmankarim.U5W3D3.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BookSection implements BookElement {
    private List<BookElement> bookPagesAndMinorSection = new ArrayList<>();

    public void addBookElement(BookElement el) {
        if (el instanceof Book) {
            System.err.println("Non puoi aggiungere un libro ad un libro ");
        } else bookPagesAndMinorSection.add(el);
    }

    @Override
    public int getPagesNumber() {
        int pagesNumber = 0;
        for (BookElement el : bookPagesAndMinorSection) {
            pagesNumber += el.getPagesNumber();
        }
        return pagesNumber;
    }

    @Override
    public void print() {
        for (BookElement el : bookPagesAndMinorSection) {
            el.print();
        }
    }
}
