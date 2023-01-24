package com.project.kotter.service.impl

import com.project.kotter.domain.Post
import com.project.kotter.service.PostService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@Transactional(readOnly = true)
class PostServiceImpl: BoxEntityServiceImpl<Post, Int>(),PostService {
    override fun findByTitle(title: String): Post {
        TODO("Not yet implemented")
    }

    override fun findByDateOfCreation(date: Date): Post {
        TODO("Not yet implemented")
    }

    override fun findByDateOfCreationBetween(date1: Date, date2: Date): Post {
        TODO("Not yet implemented")
    }

    override fun findByDateOfCreationYear(year: Int): Post {
        TODO("Not yet implemented")
    }
}