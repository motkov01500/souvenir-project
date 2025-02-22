package com.mondeshko.souvenir.souvenir.entity;

import com.mondeshko.souvenir.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "souvenir")
@Getter
@Setter
public class Souvenir extends BaseEntity {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "souvenir_generator")
  @SequenceGenerator(name = "souvenir_generator", sequenceName = "souvenir_id_seq", schema = "public", allocationSize = 1)
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "price")
  private Double price;

  @OneToMany(targetEntity = Image.class, mappedBy = "souvenir", cascade = CascadeType.REMOVE)
  private List<Image> images;
}
