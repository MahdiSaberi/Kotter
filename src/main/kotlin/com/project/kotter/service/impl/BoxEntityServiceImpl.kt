package com.project.kotter.service.impl

import com.project.kotter.base.domain.BoxEntity
import com.project.kotter.base.service.impl.BaseEntityServiceImpl
import com.project.kotter.service.BoxEntityService

class BoxEntityServiceImpl: BaseEntityServiceImpl<BoxEntity, Int>(),BoxEntityService {

    override fun findByUuid(uuid: String): BoxEntity {
        TODO("Not yet implemented")
    }
}