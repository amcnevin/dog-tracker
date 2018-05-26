package org.techndrome.dogtracker.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.techndrome.dogtracker.repository.DogRepository

/**
 * Created by Tony McNevin on 5/26/18.
 */
@RestController()
class DogController {

    @Autowired
    val repo: DogRepository = DogRepository()

    @GetMapping("/dogs")
    fun getDogs() = repo.getAllDogs()

}