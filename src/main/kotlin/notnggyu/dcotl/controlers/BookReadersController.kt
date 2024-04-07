package notnggyu.dcotl.controlers

import notnggyu.dcotl.models.BooksReader
import notnggyu.dcotl.repositories.BookReadersRepositories
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookReadersController constructor(
    private val repository: BookReadersRepositories
) {


    @GetMapping("/readers")
    fun getAllReaders(): List<BooksReader?>{
        return repository.findAll()

    }
}