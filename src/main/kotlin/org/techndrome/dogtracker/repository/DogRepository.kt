package org.techndrome.dogtracker.repository

import org.springframework.beans.factory.annotation.Autowired
import org.techndrome.dogtracker.model.Dog

/**
 * Created by Tony McNevin on 5/26/18.
 */
class DogRepository {

    @Autowired
    val dogList: MutableList<Dog> = ArrayList<Dog>()

    fun getAllDogs(): List<Dog> = dogList
}