package com.project.kotter.domain

import com.project.kotter.base.domain.UserEntity
import com.project.kotter.enumeration.GenderType
import com.project.kotter.enumeration.UserType
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity
class Admin(firstName: String,
            lastName: String,
            username: String,
            password: String,
            gender: GenderType): UserEntity(

    firstName,
    lastName,
    username,
    password,
    gender
)
{
    @Enumerated(EnumType.STRING)
    override var type: UserType = UserType.ADMIN
}