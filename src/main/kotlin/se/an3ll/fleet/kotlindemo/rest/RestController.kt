package se.an3ll.fleet.kotlindemo.rest

import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController
import se.an3ll.fleet.kotlindemo.domain.Account
import se.an3ll.fleet.kotlindemo.service.UserService

@RestController("/rest")
class RestController(val userService: UserService) {

  @PostMapping("/accounts")
  fun createUser(@RequestBody account: Account) {
    userService.createUser(account)
  }

  @GetMapping("/accounts/{id}")
  fun getUser(id:Int) {
    userService.getUser(id)
  }
}
