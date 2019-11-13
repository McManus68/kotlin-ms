package com.mcmanus.kotlinms.repository

import com.mcmanus.kotlinms.model.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : CrudRepository<Person, Int>