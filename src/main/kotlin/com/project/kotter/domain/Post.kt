package com.project.kotter.domain

import com.project.kotter.base.domain.UserEntity
import com.project.kotter.base.entity.BaseEntity
import org.apache.catalina.User
import java.util.Date
import java.util.UUID
import javax.persistence.*
import kotlin.properties.Delegates

@Entity
class Post: BaseEntity<Int>() {
    private val uuid: String = UUID.randomUUID().toString()
    private lateinit var title: String
    private lateinit var content: String
    @ManyToOne
    private lateinit var creator: UserEntity
    private var dateOfCreation: Date = Date()
    @ElementCollection(fetch = FetchType.LAZY)
    private lateinit var likedBy: List<Int>
}