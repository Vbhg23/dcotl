package notnggyu.dcotl.controlers

import notnggyu.dcotl.models.Ideologies
import notnggyu.dcotl.repositories.IdeologyStorage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class IdeologyController @Autowired constructor(
    private val ideologyStorage: IdeologyStorage
) {

    @GetMapping("/ideologies")
    fun getAllIdeologies(): List<Ideologies?> {
        return ideologyStorage.findAll()
    }

    @GetMapping("/ideologies/{name}")
    fun getIdeologyByName(@PathVariable name: String): Ideologies? {
        return ideologyStorage.findByName(name)[0]
    }

}