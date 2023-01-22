package com.project.kotter.domain

import com.project.kotter.base.domain.BoxEntity
import javax.persistence.Entity
import javax.persistence.ManyToOne

@Entity
class Comment: BoxEntity() {

    @ManyToOne
    private lateinit var post: Post

}