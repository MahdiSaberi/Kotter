package com.project.kotter.domain

import com.project.kotter.base.domain.BoxEntity
import com.project.kotter.base.domain.UserEntity
import java.util.*
import javax.persistence.Entity
import javax.persistence.ManyToMany

@Entity
class Post: BoxEntity() {
    private lateinit var title: String
    private var dateOfCreation: Date = Date()
    @ManyToMany()
    private lateinit var likedBy: MutableList<UserEntity>
}