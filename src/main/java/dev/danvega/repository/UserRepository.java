package dev.danvega.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.danvega.domain.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
