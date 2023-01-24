package com.project.kotter.repository

import com.project.kotter.domain.Post
import org.springframework.stereotype.Repository
import java.time.Year
import java.util.Date
@Repository
interface PostRepository: BoxEntityRepository<Post,Int> {
    fun findByTitle(title:String):Post
    fun findByDateOfCreation(date: Date):Post
    fun findByDateOfCreationBetween(date1: Date,date2: Date):Post
    fun findByDateOfCreationYear(year: Int):Post
}