package notnggyu.dcotl.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "ideology")
data class Ideologies(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var name: String? = null,
    var image_url: String? = null,
    var description: String? = null,
    var subtypes: String? = null,
    var id: Long? = null,
)