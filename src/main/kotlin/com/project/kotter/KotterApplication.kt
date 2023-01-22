package com.project.kotter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotterApplication

fun main(args: Array<String>) {
    runApplication<KotterApplication>(*args)
}
