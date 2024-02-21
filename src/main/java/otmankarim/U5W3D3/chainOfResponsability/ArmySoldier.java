package otmankarim.U5W3D3.chainOfResponsability;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArmySoldier {
    private Rank rank;
    private String name;

    public ArmySoldier(Rank rank, String name) {
        this.rank = rank;
        this.name = name;
    }
}
