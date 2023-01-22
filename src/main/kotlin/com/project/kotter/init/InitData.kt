package com.project.kotter.init

import com.github.javafaker.Faker
import com.project.kotter.domain.Admin

import com.project.kotter.domain.Ordinary
import com.project.kotter.enumeration.GenderType
import com.project.kotter.repository.UserEntityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
class InitData {

    private val faker: Faker = Faker()

    @Autowired
    private lateinit var userRepository: UserEntityRepository

    @Bean(name = arrayOf("initUser"))

    fun initUser(){

        var gender: GenderType? = null
        for (i in 0 .. 5) {
            if (i % 2 == 0) gender = GenderType.MALE
            else gender = GenderType.FEMALE

            val firstName: String = faker.name().firstName()
            val lastName: String = faker.name().lastName()

            userRepository.save(
                Ordinary(
                    firstName,
                    lastName,
                    "$firstName$lastName".lowercase(Locale.getDefault()),
                    faker.number().digits(5),
                    gender
                )
            )
        }

    }

    @Bean(name = arrayOf("initAdmin"))
    fun initAdmin(){
        for (i in 0 .. 1) {
            val firstName: String = faker.name().firstName()
            val lastName: String = faker.name().lastName()

            userRepository.save(
                Admin(
                    firstName,
                    lastName,
                    "$firstName$lastName".lowercase(Locale.getDefault()),
                    faker.number().digits(5),
                    GenderType.MALE
                )
            )
        }

    }
}