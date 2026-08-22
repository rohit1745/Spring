package com.cfs.jpa_p01.Repo;

import com.cfs.jpa_p01.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepo extends JpaRepository<employee, Integer> {


}
