package com.udemycourse.hrworker.Repositories;

import com.udemycourse.hrworker.Entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository <Worker, Long> {
}
