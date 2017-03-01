package com.example

import javax.persistence.*

/**
 * Created by caio.araujo on 01/03/2017.
 */
@Entity(name = "tb_names")
class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id
    String name

}
