package com.project.kotter.base.domain

import com.project.kotter.base.entity.BaseEntity
import java.util.*
import javax.persistence.ManyToOne

open abstract class BoxEntity: BaseEntity<Int>() {
    private val uuid: String = UUID.randomUUID().toString()
    private lateinit var content: String
    @ManyToOne
    private lateinit var creator: UserEntity
}