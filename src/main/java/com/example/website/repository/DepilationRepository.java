package com.example.website.repository;

import com.example.website.entity.Depilation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepilationRepository extends JpaRepository<Long, Depilation> {
}
