package com.project.kotter.base.entity

import net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy
import java.io.Serializable
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
open abstract class BaseEntity<ID: Serializable>(): Serializable {


    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: ID? = null

    override fun toString(): String {
        return "com.project.kotter.base.entity.BaseEntity(id=$id)"
    }
}