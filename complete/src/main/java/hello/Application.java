package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repo;

    @Autowired
    private BooksRepository booksRepository;

    public static void main(String[] args) {

        String s;
        int a = 2; // random

        switch (a){
            case 1:
                s = "a1";
                break;
            case 2: s = "a2";
            break;
            case 3: s = "s3";
            break;
            default:
                s="s4";

        }
        System.out.println(s);

        SpringApplication.run(Application.class);
    }


    @Override
    public void run(String... args) throws Exception  {

        Employee employee = new Employee();
        employee.setFirstName("Z Javy");
        employee.setLastName("Spring Data JPA");
        employee.setLastName("Fd");
        employee.setSalary(2L);
        System.out.println(employee.getEmployeeId());
        repo.save(employee);

        Books books = new Books();
        books.setId(3L);
        books.setName("Hobbit");
        Object o = booksRepository.findAllActiveUsersNative();
        System.out.println(o.toString());

        booksRepository.save(books);


    }
}
