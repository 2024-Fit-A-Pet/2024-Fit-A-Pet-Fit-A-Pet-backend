package fitapet.backend.fit_a_pet.Entity;

import fitapet.backend.fit_a_pet.common.CoreEntity;
import jakarta.persistence.*;

@Entity
@Table(name="mixed_feed")
public class MixedFeed extends CoreEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="mixed_feed_id")
    private Long mixedFeedId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="pet_id")
    private Pet pet;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="meat_id")
    private Meat meat;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="supplement_id")
    private Supplement supplement;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "oil_id")
    private Oil oil;
}
