package notnggyu.dcotl.models

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

data class Readers constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var name: String? = null,
    var imageURL: String? = null,
    var description: String? = null,
    var subtypes: String? = null,
    var id: Long? = null,
)