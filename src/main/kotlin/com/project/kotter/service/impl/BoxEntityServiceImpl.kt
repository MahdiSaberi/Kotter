package com.project.kotter.service.impl

import com.project.kotter.base.domain.BoxEntity
import com.project.kotter.base.entity.BaseEntity
import com.project.kotter.base.service.impl.BaseEntityServiceImpl
import com.project.kotter.enumeration.BoxType
import com.project.kotter.repository.BoxEntityRepository
import com.project.kotter.service.BoxEntityService
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.yaml.snakeyaml.events.Event
import org.yaml.snakeyaml.events.Event.ID
import java.io.Serializable
import java.lang.Exception

@Service
@Transactional(readOnly = true)
class BoxEntityServiceImpl<E:BaseEntity<ID>,ID:Serializable>: BaseEntityServiceImpl<E, ID>(),BoxEntityService<E,ID> {

    @Autowired
    private lateinit var repository: BoxEntityRepository<E,ID>

    @Transactional
    override fun findByUuid(uuid: String): E? {
        try {
            return repository.findByUuid(uuid)
        }catch (e:Exception){
            println(e.message)
            return null
        }
    }

    @Transactional
    override fun findByCreator_Id(creator_id: ID): E? {
        try {
            return repository.findByCreator_Id(creator_id)
        }catch (e:Exception){
            println(e.message)
            return null
        }
    }

    @Transactional
    override fun findByType(type: BoxType): E? {
        try {
            return repository.findByType(type)
        }catch (e:Exception){
            println(e.message)
            return null
        }
    }
}