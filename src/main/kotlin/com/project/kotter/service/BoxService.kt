package com.project.kotter.service

import com.project.kotter.base.domain.BoxEntity
import com.project.kotter.base.service.BaseEntityService

interface BoxService: BaseEntityService<BoxEntity,Int> {
    fun findByUuid(uuid: String): BoxEntity
}