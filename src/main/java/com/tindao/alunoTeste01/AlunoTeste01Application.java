package com.tindao.alunoTeste01;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class AlunoTeste01Application {

	public static void main(String[] args) {
		SpringApplication.run(AlunoTeste01Application.class, args);
	}
	
	/*
	 * Médoto para alterar o location para Pt BR
	 */
	@Bean
	public LocaleResolver localeResolver()
	{
		return (new FixedLocaleResolver(new Locale("pt", "BR")));
	}

}
