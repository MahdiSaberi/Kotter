package com.project.kotter.base.service

import com.project.kotter.base.entity.BaseEntity
import java.io.Serializable

interface BaseEntityService<E: BaseEntity<ID>,ID: Serializable> {
    fun save(e: E)
    fun update(e: E): E?
    fun delete(e: E)
    fun findById(id: ID): E
    fun existsById(id: ID): Boolean
    fun count(): Long
    }