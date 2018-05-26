package org.techndrome.dogtracker.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.techndrome.dogtracker.model.Dog

/**
 * Created by Tony McNevin on 5/26/18.
 */
@Configuration
class DogTrackerConfig {

    @Bean
    fun dogs() = listOf(Dog(123L, "Sparky"), Dog(345L, "Fido"))

}