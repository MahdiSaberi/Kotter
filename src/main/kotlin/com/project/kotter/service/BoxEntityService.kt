package com.project.kotter.service

import com.project.kotter.base.domain.BoxEntity
import com.project.kotter.base.entity.BaseEntity
import com.project.kotter.base.service.BaseEntityService
import com.project.kotter.enumeration.BoxType
import com.project.kotter.enumeration.UserType
import java.io.Serializable

interface BoxEntityService<E: BaseEntity<ID>,ID: Serializable>: BaseEntityService<E,ID> {
    fun findByUuid(uuid: String): E?
    fun findByCreator_Id(creator_id: ID): E?
    fun findByType(type: BoxType): E?
}