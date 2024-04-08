package fitapet.backend.fit_a_pet.common;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
@EntityListeners({AuditingEntityListener.class})
public class CoreEntity {

    @CreatedDate
    public LocalDateTime createdAt = LocalDateTime.now();

    @LastModifiedDate
    public LocalDateTime updatedAt;

    public LocalDateTime deletedAt = null;
    @PreRemove
    public void preRemove() {
        this.deletedAt = LocalDateTime.now();
    }
}