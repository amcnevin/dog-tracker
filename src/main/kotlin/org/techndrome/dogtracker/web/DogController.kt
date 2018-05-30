package org.techndrome.dogtracker.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.techndrome.dogtracker.model.Dog
import org.techndrome.dogtracker.service.DogLocationService

/**
 * Created by Tony McNevin on 5/26/18.
 */
@RestController()
class DogController {

    @Autowired
    val service: DogLocationService = DogLocationService()

    @GetMapping("/dogs")
    fun getDogs() = service.getAllDogs()

    @GetMapping("/dogs/{dogName}")
    fun getDogByName(@PathVariable("dogName") dogName: String): Dog? = service.locateDog(dogName)

}