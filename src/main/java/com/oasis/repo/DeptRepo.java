/**
 * 
 */
package com.oasis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oasis.entity.Department;

@Repository
public interface DeptRepo extends JpaRepository<Department, Integer> {

}
