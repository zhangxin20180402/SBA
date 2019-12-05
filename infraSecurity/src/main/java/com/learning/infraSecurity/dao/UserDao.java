package com.learning.infraSecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.infraSecurity.entity.UserEntity;

@Repository
public interface UserDao extends JpaRepository<UserEntity, Long> {

	UserEntity findByUsername(String username);
}
