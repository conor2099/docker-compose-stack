package com.latenightcode.hello

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.PreDestroy

@CrossOrigin
@RestController
class Controller(private val statusRepository: StatusRepository) {

    @GetMapping("/health")
    fun postName() : Status {
        var statusDates = statusRepository.findAll()
        return if (statusDates.isEmpty()) statusRepository.save(Status()) else statusDates[0]
    }

    @PreDestroy
    fun init() {
        statusRepository.deleteAll()
    }
}