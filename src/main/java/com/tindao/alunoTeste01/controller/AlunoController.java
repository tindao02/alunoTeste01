package com.tindao.alunoTeste01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tindao.alunoTeste01.model.Aluno;
import com.tindao.alunoTeste01.repository.Alunos;

@Controller
@RequestMapping("/alunos")
public class AlunoController 
{
	@Autowired
	private Alunos alunos;	//Repositório de alunos
	
	/*
	 * Método que irá retornar o nome do template
	 * Não usar o .html, pois futuramente se usar outra tecnologia não funcionará
	 * 
	 */
	@RequestMapping("/novo")
	public String novo()
	{
		return "CadastroAluno"; //retorno com o nome do template
	}
	
	/*
	 * Método responsável por salvar o aluno
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Aluno aluno)
	{
		alunos.save(aluno);
		return "CadastroAluno";	//Retorna a tela de cadastro
	}
}
