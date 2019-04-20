package hello;

import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Books")
public class Books {




    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public Long id;

    @Column(name = "name")
    public String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
