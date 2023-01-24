package com.project.kotter.service

import com.project.kotter.base.domain.BoxEntity
import com.project.kotter.base.service.BaseEntityService
import com.project.kotter.enumeration.BoxType

interface BoxEntityService: BaseEntityService<BoxEntity,Int> {
    fun findByUuid(uuid: String): BoxEntity?
    fun findByCreator_Id(creator_id: Int): BoxEntity?
    fun findByType(type: BoxType): BoxEntity?
}