package com.thong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thong.entity.Token;

public interface TokenRepository extends JpaRepository<Token, Integer>{

}
