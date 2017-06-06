package com.fornax.test.domain;

/*
 * Created by Adam Bodansky on 2017.06.06..
 */

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = "code")
public class Aid {

    @Id
    @GeneratedValue
    private Long id;

    private String code;
}
