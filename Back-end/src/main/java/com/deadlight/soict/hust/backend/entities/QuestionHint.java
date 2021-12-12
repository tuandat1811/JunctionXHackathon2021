package com.deadlight.soict.hust.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hint")
public class QuestionHint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hid;

    @Column()
    private String type;

    @Column(nullable = false)
    private String descript;
}
