package org.techndrome.dogtracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class DogTrackerApplication

fun main(args: Array<String>) {
    runApplication<DogTrackerApplication>(*args)
}
