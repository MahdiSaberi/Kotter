package com.project.kotter.base.service.impl

import com.github.javafaker.Bool
import com.project.kotter.base.entity.BaseEntity
import com.project.kotter.base.repository.BaseEntityRepository
import com.project.kotter.base.service.BaseEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.io.Serializable
import java.lang.Exception

@Transactional(readOnly = true)
class BaseEntityServiceImpl<E: BaseEntity<ID>,ID: Serializable>: BaseEntityService<E,ID> {

    @Autowired
    private lateinit var repository: BaseEntityRepository<E,ID>

    @Transactional
    override fun save(e: E){
        try {
            repository.save(e)
        }catch (e:Exception){
            println(e.message)
        }
    }

    @Transactional
    override fun update(e: E):E?{
        try {
            if(e.id != null) return repository.save(e)
            else return null
        }catch (e:Exception) {
            println(e.message)
            return null }
    }

    @Transactional
    override fun delete(e:E){
        try {
           repository.delete(e)
        }catch (e:Exception){
            println(e.message)
        }
    }

    @Transactional
    override fun findById(id: ID): E{
        return repository.findById(id).get()
    }

    override fun existsById(id: ID): Boolean{
        return repository.existsById(id)
    }

    override fun count(): Long {
        return repository.count()
    }
}