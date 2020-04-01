package com.latenightcode.hello

import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "service_status")
data class Status(@Id @Column("status_date") val statusDate: Instant = Instant.now())