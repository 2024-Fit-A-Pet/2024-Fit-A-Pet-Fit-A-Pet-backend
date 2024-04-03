package fitapet.backend.fit_a_pet.Entity;

import fitapet.backend.fit_a_pet.common.CoreEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="users")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@ToString
public class User extends CoreEntity{

    @Column(name="name",nullable = false)
    @Size(min=4, max=15)
    public String name;

    @Email
    @Size(min=4, max=50)
    @Column(name="email",nullable = false)
    public String email;

    @Column(name="password",nullable = false)
    public String password;
}
