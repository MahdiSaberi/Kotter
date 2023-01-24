package com.project.kotter.service

import com.project.kotter.base.service.BaseEntityService
import com.project.kotter.domain.Post
import java.util.*
import javax.swing.Box

interface PostService:BoxEntityService<Post,Int> {
    fun findByTitle(title:String):Post?
    fun findByDateOfCreation(date: Date):Post?
    fun findByDateOfCreationBetween(date1: Date, date2: Date):Post?
    fun findByDateOfCreationYear(year: Int):Post?
}