package com.simplemicroservice.hrworker.repositories;

import com.simplemicroservice.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
