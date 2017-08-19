package se.an3ll.fleet.kotlindemo.service

import org.springframework.stereotype.Service
import se.an3ll.fleet.kotlindemo.domain.Account
import se.an3ll.fleet.kotlindemo.repository.AccountRepository

@Service
class UserService(val accountRepository: AccountRepository) {

  fun createUser(account: Account) {
    accountRepository.save(account)
  }

  fun getUser(id: Int) {
    accountRepository.findById(id)
  }
}
