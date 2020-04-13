package com.demo.jpa.springjpahibernateexample.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.jpa.springjpahibernateexample.model.Users;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findByName(String name);

}
