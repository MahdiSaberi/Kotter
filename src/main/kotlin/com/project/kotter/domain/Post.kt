package com.project.kotter.domain

import com.project.kotter.base.domain.BoxEntity
import com.project.kotter.base.domain.UserEntity
import com.project.kotter.enumeration.BoxType
import java.util.*
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.ManyToMany

@Entity
class Post: BoxEntity() {

    private lateinit var title: String
    private var dateOfCreation: Date = Date()
    @ManyToMany()
    private lateinit var likedBy: MutableList<UserEntity>
    @Enumerated(EnumType.STRING)
    private val type: BoxType = BoxType.POST
}