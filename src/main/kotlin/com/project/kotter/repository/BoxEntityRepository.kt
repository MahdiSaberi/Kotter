package com.project.kotter.repository

import com.project.kotter.base.domain.BoxEntity
import com.project.kotter.base.repository.BaseEntityRepository
import com.project.kotter.enumeration.BoxType
import org.springframework.stereotype.Repository

@Repository
interface BoxEntityRepository: BaseEntityRepository<BoxEntity,Int>{
    fun findByUuid(uuid: String): BoxEntity
    fun findByCreator_Id(creator_id: Int): BoxEntity
    fun findByType(type: BoxType): BoxEntity

}