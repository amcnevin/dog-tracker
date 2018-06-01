package org.techndrome.dogtracker.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.techndrome.dogtracker.model.Dog
import org.techndrome.dogtracker.model.FloorPlan
import org.techndrome.dogtracker.service.DogLocationService

/**
 * Created by Tony McNevin on 5/26/18.
 */
@RestController()
class DogTrackerController {

    @Autowired
    val service: DogLocationService = DogLocationService()

    // TODO move to Service/Repo
    @Autowired
    val floorplan: FloorPlan = FloorPlan(mutableListOf())

    @GetMapping("/dogs")
    fun getDogs() = service.getAllDogs()

    @GetMapping("/dogs/{dogName}")
    fun getDogByName(@PathVariable("dogName") dogName: String): Dog? = service.locateDog(dogName)

    @GetMapping("/floorplan")
    fun getFloorPlan() = floorplan

}