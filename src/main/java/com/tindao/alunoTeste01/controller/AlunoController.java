package com.tindao.alunoTeste01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tindao.alunoTeste01.model.Aluno;

@Controller
@RequestMapping("/alunos")
public class AlunoController 
{
	/*
	 * Classe que irá retornar o nome do template
	 * Não usar o .html, pois futuramente se usar outra tecnologia não funcionará
	 * 
	 */
	@RequestMapping("/novo")
	public String novo()
	{
		return "CadastroAluno"; //retorno com o nome do template
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Aluno aluno)
	{
		System.out.println("<<<<<" + aluno.getDescricao());
		return "CadastroAluno";
	}
}
