package notnggyu.dcotl.repositories

import notnggyu.dcotl.models.Ideologies
import org.springframework.data.jpa.repository.JpaRepository

interface IdeologyStorage: JpaRepository<Ideologies?, Long?>