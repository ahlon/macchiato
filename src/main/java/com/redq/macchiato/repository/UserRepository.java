package com.redq.macchiato.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.redq.macchiato.entity.user.User;

//@RepositoryRestResource(collectionResourceRel = "user", path = "user")
@Repository
public interface UserRepository extends BaseRepository<User> {

	@Query("select u from User u where u.username like %:username%")
    List<User> findByUsername(@Param("username") String username);
	
}