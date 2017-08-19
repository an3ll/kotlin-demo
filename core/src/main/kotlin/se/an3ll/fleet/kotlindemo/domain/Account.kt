package se.an3ll.fleet.kotlindemo.domain

import javax.persistence.*


@Entity
class Account(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val firstName: String,
    val lastName: String

)
