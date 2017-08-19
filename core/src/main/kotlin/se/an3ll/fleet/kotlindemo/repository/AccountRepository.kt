package se.an3ll.fleet.kotlindemo.repository

import org.springframework.data.repository.CrudRepository
import se.an3ll.fleet.kotlindemo.domain.Account


interface AccountRepository : CrudRepository<Account, Long> {

  fun findById(id: Int)

  fun findByLastName(lastName: Int): List<Account>
}
