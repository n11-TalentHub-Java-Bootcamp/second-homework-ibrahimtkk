package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "URUNYORUM")
public class ProductComment {

    @SequenceGenerator(name = "generator", sequenceName = "URUN_YORUM_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "YORUM", length = 500)
    private String comment;

    @Column(name = "YORUMTARIHI", length = 50)
    private Date commentDate;

    @Column(name = "URUN_ID", nullable = false, length = 50)
    private Long productId;

    @Column(name = "KULLANICI_ID", nullable = false, length = 15)
    private Long userId;


}
