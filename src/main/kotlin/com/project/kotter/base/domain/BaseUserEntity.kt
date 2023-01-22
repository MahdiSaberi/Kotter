package com.project.kotter.base.domain

import com.project.kotter.base.entity.BaseEntity
import com.project.kotter.enumeration.GenderType
import com.project.kotter.enumeration.UserType
import javax.persistence.*

@Entity
@Table(name = "user_table")
@Inheritance(strategy = InheritanceType.JOINED)
open abstract class BaseUserEntity(
     var firstName: String,
     var lastName: String,
     var username: String,
     var password: String,
     @Enumerated(EnumType.STRING) var gender: GenderType?
) : BaseEntity<Int>() {

    open lateinit var type: UserType
}