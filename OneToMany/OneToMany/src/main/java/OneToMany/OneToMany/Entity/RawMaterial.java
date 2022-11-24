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
@Table(name = "raw_material")
public class RawMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "material_name")
    private String name;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "unit_of_measurement")
    private String unitOfMeasurement;

    @Column(name = "manufacture_price")
    private int price;

    @Column(name = "thread_type")
    private String threadType;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

}
