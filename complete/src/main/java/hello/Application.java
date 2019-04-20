package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... args) throws Exception {

        Employee employee = new Employee();
        employee.setFirstName("Z Javy");
        employee.setLastName("Spring Data JPA");
        employee.setSalary(2L);
        repo.save(employee);
    }
}
