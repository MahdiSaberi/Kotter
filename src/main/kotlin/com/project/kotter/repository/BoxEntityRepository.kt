package com.project.kotter.repository

import com.project.kotter.base.domain.BoxEntity
import com.project.kotter.base.entity.BaseEntity
import com.project.kotter.base.repository.BaseEntityRepository
import com.project.kotter.enumeration.BoxType
import org.springframework.stereotype.Repository
import java.io.Serializable

@Repository
interface BoxEntityRepository<E: BaseEntity<ID>,ID: Serializable>: BaseEntityRepository<E,ID>{
    fun findByUuid(uuid: String): E
    fun findByCreator_Id(creator_id: ID): E
    fun findByType(type: BoxType): E

}