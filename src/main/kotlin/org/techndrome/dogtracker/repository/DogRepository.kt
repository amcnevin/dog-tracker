package org.techndrome.dogtracker.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.techndrome.dogtracker.model.Dog

/**
 * Created by Tony McNevin on 5/26/18.
 */
@Repository
class DogRepository {

    @Autowired
    val dogSet: MutableSet<Dog> = HashSet<Dog>()

    fun getAllDogs(): Set<Dog> = dogSet

}