package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ICMSComIss extends Imposto{
	
	public ICMSComIss(Imposto outro) {
		super(outro);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal icms = new ICMS(null).calcular(orcamento);
		BigDecimal iss = new ISS(null).calcular(orcamento);
		return icms.add(iss);
		
	}

	@Override
	protected BigDecimal realizarCalculo(Orcamento orcamento) {
		return null;
	}

}
