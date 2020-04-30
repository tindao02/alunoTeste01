package com.tindao.alunoTeste01.model;

public enum StatusAluno 
{
	ATIVO("Ativo"),
	PENDENTE("Pendente"),
	SUSPENSO("Suspenso"),
	INATIVO("Inativo"),
	EXPULSO("Expulso");
	
	private String descricao;
	
	private StatusAluno(String descricao) 
	{
		this.descricao = descricao;
	}
	
	public String getDescricao()
	{
		return (descricao);
	}
}
