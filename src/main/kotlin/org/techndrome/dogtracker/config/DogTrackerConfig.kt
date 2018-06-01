package org.techndrome.dogtracker.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.techndrome.dogtracker.model.Coordinate
import org.techndrome.dogtracker.model.Dog
import org.techndrome.dogtracker.model.FloorPlan

/**
 * Created by Tony McNevin on 5/26/18.
 */
@Configuration
class DogTrackerConfig {

    @Bean
    fun dogs() = setOf(Dog(123L, "Sparky"), Dog(345L, "Fido"))

    //TODO build out floor plan coords
    @Bean
    fun floorPlan() : FloorPlan {
        var coordList : MutableList<Coordinate> = mutableListOf<Coordinate>()
        coordList.add(Coordinate(10, 10))
        coordList.add(Coordinate(10, 50))
        coordList.add(Coordinate(60,50))
        coordList.add(Coordinate( 60, 10))
        val fp : FloorPlan = FloorPlan(coordList)
        return fp
    }

}