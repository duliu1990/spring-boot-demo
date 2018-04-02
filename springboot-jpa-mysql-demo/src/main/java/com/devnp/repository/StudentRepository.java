package com.devnp.repository;

import com.devnp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by duliu on 23/7/2017.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
