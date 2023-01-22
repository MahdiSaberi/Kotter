package com.project.kotter.domain

import com.project.kotter.base.domain.UserEntity
import com.project.kotter.base.entity.BaseEntity
import java.util.*
import javax.persistence.Entity
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne

@Entity
class Post: BaseEntity<Int>() {
    private val uuid: String = UUID.randomUUID().toString()
    private lateinit var title: String
    private lateinit var content: String
    @ManyToOne
    private lateinit var creator: UserEntity
    private var dateOfCreation: Date = Date()
    @ManyToMany()
    private lateinit var likedBy: MutableList<UserEntity>
}