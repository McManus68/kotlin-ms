package com.mcmanus.kotlinms.services

import com.mcmanus.kotlinms.model.Person
import com.mcmanus.kotlinms.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonService {

    @Autowired
    lateinit var repository: PersonRepository

    fun getById(id: Int): Person? = repository.findById(id).get()

    fun getAll(): MutableIterable<Person> = repository.findAll()

    fun add(person: Person): Person = repository.save(person)

    fun update(person: Person): Person = repository.save(person)

    fun remove(id: Int) {
        repository.deleteById(id)
    }
}