package com.gustavomarques.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavomarques.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
