package com.latenightcode.hello

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.time.Instant

@Repository
interface StatusRepository : JpaRepository<Status, Instant>