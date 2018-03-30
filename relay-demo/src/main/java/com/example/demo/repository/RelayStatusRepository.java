package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.RelayStatus;

@Repository
public interface RelayStatusRepository extends JpaRepository<RelayStatus, String> {

}
