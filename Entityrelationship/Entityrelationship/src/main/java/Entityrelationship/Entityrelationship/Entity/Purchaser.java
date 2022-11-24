package Entityrelationship.Entityrelationship.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "purchaser_table")
public class Purchaser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "address")
    private String address;

    @Column(name = "cell_number")
    private String cellNumber;

    @Column(name = "gender")
    private String gender;

    @OneToMany(mappedBy = "purchaser",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Dressess> dressess;

}
