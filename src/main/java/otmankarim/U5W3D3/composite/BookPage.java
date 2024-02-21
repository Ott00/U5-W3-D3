package otmankarim.U5W3D3.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BookPage implements BookElement {
    private String content;

    @Override
    public int getPagesNumber() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
