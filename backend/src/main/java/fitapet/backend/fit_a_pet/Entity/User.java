package fitapet.backend.fit_a_pet.Entity;

import fitapet.backend.fit_a_pet.common.CoreEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="users")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User extends CoreEntity{

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    @Column(name="name",nullable = false)
    @Size(min=4, max=15)
    private String name;

    @Email
    @Size(min=4, max=50)
    @Column(name="email",nullable = false)
    private String email;

    @Column(name="password",nullable = false)
    private String password;
}
