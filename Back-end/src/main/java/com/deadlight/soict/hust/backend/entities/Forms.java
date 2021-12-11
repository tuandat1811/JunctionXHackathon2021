package com.deadlight.soict.hust.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "forms")
public class Forms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fid;

    @Column(nullable = false)
    private String formname;

    @Column(nullable = false)
    private String formtype;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String answer;

}
