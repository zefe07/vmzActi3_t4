package com.zeferino.spring.vmzact3_t4.repository;

import com.zeferino.spring.vmzact3_t4.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}