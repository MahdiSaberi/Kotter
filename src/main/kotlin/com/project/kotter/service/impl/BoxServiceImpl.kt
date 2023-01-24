package com.project.kotter.service.impl

import com.project.kotter.base.domain.BoxEntity
import com.project.kotter.base.service.impl.BaseEntityServiceImpl
import com.project.kotter.service.BoxService

class BoxServiceImpl: BaseEntityServiceImpl<BoxEntity, Int>(),BoxService {

    override fun findByUuid(uuid: String): BoxEntity {
        TODO("Not yet implemented")
    }
}