package notnggyu.dcotl.controlers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestControler {

    @GetMapping("/test")
    fun testGetRequest(): String {
        return "(GET) Please, copy and paste this link to Chrome: https://www.youtube.com/watch?v=dQw4w9WgXcQ"
    }

    @PostMapping("/test")
    fun testPostRequest(): String {
        return "(Post) Please, copy and paste this link to Chrome: https://www.youtube.com/watch?v=dQw4w9WgXcQ"
    }

    @PutMapping("/test")
    fun testPutRequest(): String {
        return "(PUT) Please, copy and paste this link to Chrome: https://www.youtube.com/watch?v=dQw4w9WgXcQ"
    }
}