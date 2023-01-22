package com.project.kotter.base.domain

import com.project.kotter.base.entity.BaseEntity
import com.project.kotter.enumeration.BoxType
import java.util.*
import javax.persistence.Entity
import javax.persistence.Inheritance
import javax.persistence.InheritanceType
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "box")
@Inheritance(strategy = InheritanceType.JOINED)
open abstract class BoxEntity: BaseEntity<Int>() {
    private val uuid: String = UUID.randomUUID().toString()
    private lateinit var content: String
    @ManyToOne
    private lateinit var creator: UserEntity
    open lateinit var type: BoxType
}