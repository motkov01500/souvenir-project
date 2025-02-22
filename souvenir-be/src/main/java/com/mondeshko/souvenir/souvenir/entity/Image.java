package com.mondeshko.souvenir.souvenir.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "image")
@Getter
@Setter
public class Image {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "image_generator")
  @SequenceGenerator(name = "image_generator", sequenceName = "image_id_seq", schema = "public", allocationSize = 1)
  private Integer id;

  @Lob
  @Column(name = "image_data")
  private byte[] image;

  @ManyToOne(targetEntity = Souvenir.class)
  @JoinColumn(name = "souvenir_id")
  private Souvenir souvenir;
}
