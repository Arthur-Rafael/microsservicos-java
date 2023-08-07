package com.arthur.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
