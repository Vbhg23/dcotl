package notnggyu.dcotl.repositories

import notnggyu.dcotl.models.BooksReader
import org.springframework.data.jpa.repository.JpaRepository

interface BookReadersRepositories: JpaRepository<BooksReader?, Long?>