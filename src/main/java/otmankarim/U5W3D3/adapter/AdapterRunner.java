package otmankarim.U5W3D3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        InfoAdapter info = new InfoAdapter(new Info("Riccardo", "Gulin", LocalDate.now().minusYears(30)));
        UserData user = new UserData();
        user.getData(info);

        System.out.println(user + "\n");

    }
}
