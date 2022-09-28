package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.project.entites.User;



public interface UserRepo extends CrudRepository<User, Integer> {
	public List<User> findByCity(String city);
	
	@Query(value = "SELECT * FROM user ORDER BY user.id DESC", nativeQuery = true)
	public List<User> findAllReverseId();
	
//	CUSTOM QUERY 
	@Query("SELECT u FROM User u ORDER BY u.name DESC")
	public List<User> findAllOrderName();
	
	@Query("SELECT u FROM User u WHERE u.name =:c")
	public List<User> findByName(@Param("c")String s);
	
//	NATIVE QUERY 
	@Query(value = "SELECT * FROM user u ORDER BY u.id DESC", nativeQuery = true)
	public List<User> findAllSordtedById();
	
}
