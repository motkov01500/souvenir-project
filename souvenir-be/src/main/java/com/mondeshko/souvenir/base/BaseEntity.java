package com.mondeshko.souvenir.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

  @CreationTimestamp
  @Column(name = "created_at")
  private LocalDate createdAt;

  @UpdateTimestamp
  @Column(name = "last_updated_at")
  private LocalDateTime lastUpdatedAt;
}
