package Entityrelationship.Entityrelationship.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dressess_table")
public class Dressess {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "sales_range")
    private String salesRange;

    @Column(name = "total_price")
    private String totalPrice;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purchaser_id")
    @JsonIgnore
    private Purchaser purchaser;


}
