package notnggyu.dcotl.controlers

import notnggyu.dcotl.models.InitialPageData
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CommonControler {

    @GetMapping("/")
    fun getInitialPageData(): InitialPageData {
        return InitialPageData()
    }
}
