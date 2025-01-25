
package com.example.StdDetails.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StdDetails.model.Student;

@Repository
interface StdRepo extends JpaRepository<Student, Integer> {

}
