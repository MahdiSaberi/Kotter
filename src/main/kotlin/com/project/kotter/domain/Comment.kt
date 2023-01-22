package com.project.kotter.domain

import com.project.kotter.base.domain.BoxEntity
import com.project.kotter.enumeration.BoxType
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.ManyToOne

@Entity
class Comment: BoxEntity() {

    @ManyToOne
    private lateinit var post: Post
    @Enumerated(EnumType.STRING)
    private val type: BoxType = BoxType.COMMENT

}