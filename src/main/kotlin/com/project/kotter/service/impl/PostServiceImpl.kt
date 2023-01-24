package com.project.kotter.service.impl

import com.project.kotter.domain.Post
import com.project.kotter.repository.PostRepository
import com.project.kotter.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.Exception
import java.util.*

@Service
@Transactional(readOnly = true)
class PostServiceImpl: BoxEntityServiceImpl<Post, Int>(),PostService {

    @Autowired
    private lateinit var repository: PostRepository
    @Transactional
    override fun findByTitle(title: String): Post? {
        try {
            return repository.findByTitle(title)
        }catch (e:Exception){
            println(e.message)
            return null
        }
    }

    @Transactional
    override fun findByDateOfCreation(date: Date): Post? {
        try {
            return repository.findByDateOfCreation(date)
        }catch (e:Exception){
            println(e.message)
            return null
        }
    }

    @Transactional
    override fun findByDateOfCreationBetween(date1: Date, date2: Date): Post? {
        try {
            return repository.findByDateOfCreationBetween(date1,date2)
        }catch (e:Exception){
            println(e.message)
            return null
        }
    }

    @Transactional
    override fun findByDateOfCreationYear(year: Int): Post? {
        try {
            return repository.findByDateOfCreationYear(year)
        }catch (e:Exception){
            println(e.message)
            return null
        }
    }
}