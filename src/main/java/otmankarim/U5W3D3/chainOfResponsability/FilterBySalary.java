package otmankarim.U5W3D3.chainOfResponsability;

import lombok.Setter;

@Setter
public class FilterBySalary extends Filter {
    private int salaryToCheck;

    public FilterBySalary(int salaryToCheck) {
        this.salaryToCheck = salaryToCheck;
    }

    @Override
    public void check(ArmySoldier armySoldier) {
        if (armySoldier.getRank().getSalary() > salaryToCheck) {
            System.out.println("The soldier with rank " + armySoldier.getRank() + " earn more than:" + salaryToCheck);
            this.next(armySoldier);
        } else if (armySoldier.getRank().getSalary() == salaryToCheck) {
            System.out.println("The soldier with rank " + armySoldier.getRank() + " earn exactly:" + salaryToCheck);
            this.next(armySoldier);
        } else {
            System.out.println("The soldier with rank " + armySoldier.getRank() + " earn less than:" + salaryToCheck);
            this.next(armySoldier);
        }
    }
}
