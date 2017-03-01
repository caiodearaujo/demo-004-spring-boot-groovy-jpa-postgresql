package com.example

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CharacterRepository extends CrudRepository<Character, Integer> {
}
