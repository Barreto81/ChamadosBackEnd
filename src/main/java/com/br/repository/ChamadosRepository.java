package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.model.Chamados;

@Repository
public interface ChamadosRepository extends JpaRepository<Chamados, Long>{

}