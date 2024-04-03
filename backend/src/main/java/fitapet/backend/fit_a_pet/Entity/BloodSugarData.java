package fitapet.backend.fit_a_pet.Entity;

import fitapet.backend.fit_a_pet.common.CoreEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name="blood_sugar_data")
@Entity
public class BloodSugarData extends CoreEntity {
    @Id
    @Column(name="blood_sugar_data_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String device;

    private String code;

    private LocalDateTime timeStamp;

    private Integer recordType;

    private Integer bloodSugar;

    private Integer scanBloodSugar;
}
