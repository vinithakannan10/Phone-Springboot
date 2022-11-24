package OneToMany.OneToMany.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "output_product")
public class OutputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "unit_of_measurement")
    private String unitOfMeasurement;

    @Column(name = "manufacture_price")
    private int price;

    @Column(name = "thread_type")
    private String threadType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @JsonIgnore
    private Product product;
}

