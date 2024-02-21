package otmankarim.U5W3D3.chainOfResponsability;

import lombok.Setter;

@Setter
public abstract class Filter {
    private Filter nextFilter;

    public abstract void check(ArmySoldier armySoldier);

    public void next(ArmySoldier armySoldier) {
        if (this.nextFilter != null) {
            this.nextFilter.check(armySoldier);
        } else {
            System.out.println("Filter chain closed");
        }

    }
}
