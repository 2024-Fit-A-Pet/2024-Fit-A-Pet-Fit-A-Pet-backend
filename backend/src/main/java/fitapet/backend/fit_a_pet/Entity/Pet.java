package fitapet.backend.fit_a_pet.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String species;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Double weight;

    @Temporal(TemporalType.DATE)
    private Date startedDate;

    private String feed;
    private String soreSpot;
    private String profileUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private  Date updatedAt;

    private Boolean isDeleted;

    public Pet() {

    }

    public Pet(Long id, String name, Integer age, String species, Gender gender, Double weight, Date startedDate, String feed, String soreSpot, String profileUrl, Users users, Date createdAt, Date updatedAt, Boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.species = species;
        this.gender = gender;
        this.weight = weight;
        this.startedDate = startedDate;
        this.feed = feed;
        this.soreSpot = soreSpot;
        this.profileUrl = profileUrl;
        this.users = users;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isDeleted = isDeleted;
    }
}
