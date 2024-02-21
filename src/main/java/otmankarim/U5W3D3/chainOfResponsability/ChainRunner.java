package otmankarim.U5W3D3.chainOfResponsability;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        ArmySoldier armySoldier = new ArmySoldier(Rank.MAGGIORE, "Riccardo");

        FilterBySalary filterBySalary = new FilterBySalary(1000);
        FilterBySalary filterBySalary2 = new FilterBySalary(3000);
        FilterBySalary filterBySalary3 = new FilterBySalary(4000);

        filterBySalary.setNextFilter(filterBySalary2);
        filterBySalary2.setNextFilter(filterBySalary3);

        System.out.println("\n**Salary Check**");
        filterBySalary.check(armySoldier);
        System.out.println();
    }
}
