package OneToMany.OneToMany.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.hibernate.sql.Update;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_tables")
@SQLDelete(sql = "UPDATE product_tables SET deleted = true WHERE id=?")
//@Where(clause = "is_active=1")
 @Where(clause = "deleted=false")
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        private int id;

        @Column(name = "outfit_name")
        private String name;

        @Column(name = "outfit_code")
        private int code;

        @Column(name = "outfit_size")
        private int size;

        @Column(name = "quantity")
        private int quantity;

        @Column(name = "description")
        private String description;
      // @Column(name="is_active")
     //  private boolean isActive = true;
        @Column(name = "deleted")
        private boolean deleted = Boolean.FALSE;
        @Column(name = "deleted_by")
        private String deletedBy;

        @Column(name = "deleted_on")
        private Date deletedOn;

        @Column(name = "created_by")
        private String createdBy;

        @Column(name = "created_on")
        private Date createdOn;

        @Column(name = "update_by")
        private String updateBy;

        @JsonFormat(pattern = "YYYY/MM/DD")
        @Column(name = "update_on")
        private Date updateOn;

        @OneToMany(mappedBy ="product",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
        private List<OutputProduct> outputProduct;

        @OneToMany(mappedBy ="product",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
        private List<RawMaterial> rawMaterial;
    }







