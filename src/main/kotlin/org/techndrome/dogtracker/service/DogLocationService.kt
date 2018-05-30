package org.techndrome.dogtracker.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.techndrome.dogtracker.model.Dog
import org.techndrome.dogtracker.repository.DogRepository

/**
 * Created by Tony McNevin on 5/29/18.
 */
@Service
class DogLocationService {

    @Autowired
    var dogRepo: DogRepository = DogRepository()

    fun locateDog(dogName: String) : Dog? = dogRepo.getAllDogs().firstOrNull { dog -> dog.name == dogName }

    fun getAllDogs() : Set<Dog> = dogRepo.getAllDogs()



}