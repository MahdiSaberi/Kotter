package com.project.kotter.base.domain

import com.project.kotter.base.entity.BaseEntity
import com.project.kotter.domain.Post
import com.project.kotter.enumeration.GenderType
import com.project.kotter.enumeration.UserType
import javax.persistence.*

@Entity
@Table(name = "user_table")
@Inheritance(strategy = InheritanceType.JOINED)
open abstract class UserEntity(
     var firstName: String,
     var lastName: String,
     var username: String,
     var password: String,
     @Enumerated(EnumType.STRING) var gender: GenderType?
) : BaseEntity<Int>() {

     @OneToMany(mappedBy = "creator")
     private lateinit var posts: List<Post>
     open lateinit var type: UserType
//     @ManyToMany
//     private lateinit var liked: List<Post>
}