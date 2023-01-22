package com.project.kotter.repository.base

import com.project.kotter.base.domain.UserEntity
import com.project.kotter.base.repository.BaseEntityRepository

interface BaseUserEntityRepository: BaseEntityRepository<UserEntity,Int> {
}