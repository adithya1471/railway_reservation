package com.oasis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oasis.entity.TaskTwo;
@Repository
public interface TaskRepo extends JpaRepository<TaskTwo, Integer> {

}
