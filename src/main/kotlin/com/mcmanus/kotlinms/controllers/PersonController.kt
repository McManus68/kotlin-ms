package com.mcmanus.kotlinms.controllers

import com.mcmanus.kotlinms.model.Person
import com.mcmanus.kotlinms.services.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/persons")
class PersonController {

    @Autowired
    lateinit var service: PersonService

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): Person? = service.getById(id)

    @GetMapping
    fun findAll(): MutableIterable<Person> = service.getAll()

    @PostMapping
    fun add(@RequestBody person: Person): Person = service.add(person)

    @PutMapping
    fun update(@RequestBody person: Person): Person = service.update(person)

    @DeleteMapping("/{id}")
    fun remove(@PathVariable id: Int) { service.remove(id) }

}