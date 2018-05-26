package org.techndrome.dogtracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DogTrackerApplication

fun main(args: Array<String>) {
    runApplication<DogTrackerApplication>(*args)
}
