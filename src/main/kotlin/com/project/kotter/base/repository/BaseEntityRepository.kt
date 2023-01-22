package com.project.kotter.base.repository

import com.project.kotter.base.entity.BaseEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean
import java.io.Serializable

@NoRepositoryBean
interface BaseEntityRepository<E: BaseEntity<ID>,ID: Serializable>: JpaRepository<E,ID> {
}