package com.project.kotter.service.impl

import com.project.kotter.base.domain.BoxEntity
import com.project.kotter.base.service.impl.BaseEntityServiceImpl
import com.project.kotter.enumeration.BoxType
import com.project.kotter.repository.BoxEntityRepository
import com.project.kotter.service.BoxEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.Exception

@Service
@Transactional(readOnly = true)
class BoxEntityServiceImpl: BaseEntityServiceImpl<BoxEntity, Int>(),BoxEntityService {

    @Autowired
    private lateinit var repository: BoxEntityRepository
    @Transactional
    override fun findByUuid(uuid: String): BoxEntity? {
        try {
            return repository.findByUuid(uuid)
        }catch (e:Exception){
            println(e.message)
            return null
        }
    }

    @Transactional
    override fun findByCreator_Id(creator_id: Int): BoxEntity? {
        try {
            return repository.findByCreator_Id(creator_id)
        }catch (e:Exception){
            println(e.message)
            return null
        }
    }

    @Transactional
    override fun findByType(type: BoxType): BoxEntity? {
        try {
            return repository.findByType(type)
        }catch (e:Exception){
            println(e.message)
            return null
        }
    }
}