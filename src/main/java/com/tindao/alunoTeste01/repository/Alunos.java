package com.tindao.alunoTeste01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tindao.alunoTeste01.model.Aluno;

public interface Alunos extends JpaRepository<Aluno, Long>
{

}
