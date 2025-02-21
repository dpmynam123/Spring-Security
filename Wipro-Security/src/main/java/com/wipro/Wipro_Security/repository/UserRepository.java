package com.wipro.Wipro_Security.repository;

import com.wipro.Wipro_Security.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInfo,Integer> {
    Optional<UserInfo> findByName(String username);
}