package org.techndrome.dogtracker.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import org.techndrome.dogtracker.model.Dog
import org.techndrome.dogtracker.repository.DogRepository
import java.util.*

/**
 * Created by Tony McNevin on 5/29/18.
 */
@Service
class NoiseGenService {


    @Autowired
    var repo: DogRepository = DogRepository()

    var rand: Random = Random()


    @Scheduled(fixedRate = 5000)
    fun moveDogs() {
        repo.getAllDogs().forEach { dog -> moveDog(dog)}
    }

    fun moveDog(dog: Dog) {
        dog.coord.x = rand.nextDouble()
        dog.coord.y = rand.nextDouble()
    }
}