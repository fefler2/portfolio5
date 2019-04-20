package hello;

import javax.persistence.*;

@Entity
@Table(name = "HOTEL")
public class Hotel {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "HotelAddres")
    private String HotelAddres;

}
