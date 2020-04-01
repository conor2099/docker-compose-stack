package com.latenightcode.hello

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class HelloApplication {
    @Bean
    fun init(statusRepository: StatusRepository): CommandLineRunner? {
        return CommandLineRunner {
            statusRepository.deleteAll()
            statusRepository.save(Status())
        }
    }
}

fun main(args: Array<String>) {
    runApplication<HelloApplication>(*args)
}