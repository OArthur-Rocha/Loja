package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento{
	
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}
	
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}
	
	

}
