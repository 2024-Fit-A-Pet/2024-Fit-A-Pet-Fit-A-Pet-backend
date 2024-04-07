package fitapet.backend.fit_a_pet.Entity;

import fitapet.backend.fit_a_pet.common.CoreEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Table(name="pet")
@Entity
@Getter
public class Pet extends CoreEntity {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="pet_id")
    private Long id;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @Column(name="species")
    private String species;

    @Column(name="gender")
    private String gender;

    @Column(name="weight")
    private double weight;

    @Column(name="started_date")
    private LocalDateTime started_date;

    @Column(name="feed")
    private String feed;

    @Column(name="sore_sport")
    private String sore_sport;

    @Column(name="profile_url")
    private String profile_url;

    public Pet() {

    }
}
