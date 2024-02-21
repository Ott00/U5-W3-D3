package otmankarim.U5W3D3.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Set<Author> authors = new HashSet<>();
        authors.add(new Author("Riccardo", "Gulin"));
        authors.add(new Author("Stefano", "Miceli"));

        Book book = new Book(14.99, authors);

        BookSection bookSection = new BookSection();
        bookSection.addBookElement(new BookPage("Lorem ipsum"));
        bookSection.addBookElement(new BookPage("Ipsum Lorem"));
        bookSection.addBookElement(new BookPage("Epicode Lorem"));
        bookSection.addBookElement(new BookPage("Ipsum Epicode"));

        BookSection bookSectionSinglePage = new BookSection();
        bookSectionSinglePage.addBookElement(new BookPage("Pagina Singola"));

        book.addBookElement(bookSection);
        book.addBookElement(bookSectionSinglePage);

        System.out.println(
                "Numero di pagine: " + book.getPagesNumber() + "\n" +
                        "Prezzo: " + book.getPrice() + "\n"
        );

        System.out.println("**Stampa del libro**");
        book.print();


    }
}
