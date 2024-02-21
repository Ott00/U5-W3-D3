package otmankarim.U5W3D3.chainOfResponsability;

import lombok.Getter;

@Getter
public enum Rank {
    TENENTE(1000),
    CAPITANO(2000),
    MAGGIORE(3000),
    COLONNELLO(4000),
    GENERALE(5000);

    private int salary;

    Rank(int salary) {
        this.salary = salary;
    }
}
