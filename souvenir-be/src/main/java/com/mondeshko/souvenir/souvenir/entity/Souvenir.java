package com.mondeshko.souvenir.souvenir.entity;

import com.mondeshko.souvenir.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "souvenir")
@Getter
@Setter
public class Souvenir extends BaseEntity {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meeting_generator")
  @SequenceGenerator(name = "meeting_generator", sequenceName = "souvenir_id_seq", schema = "public", allocationSize = 1)
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "price")
  private Double price;
}
