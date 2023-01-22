package com.project.kotter.domain

import com.project.kotter.base.domain.BaseUserEntity
import com.project.kotter.enumeration.GenderType
import com.project.kotter.enumeration.UserType
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Table

@Entity
@Table(name="user_table")
class Ordinary(
    firstName: String,
    lastName: String,
    username: String,
    password: String,
    gender: GenderType?
) : BaseUserEntity(
    firstName,
    lastName,
    username,
    password,
    gender
) {

    @Enumerated(EnumType.STRING)
    override var type: UserType = UserType.ORDINARY
}