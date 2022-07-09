package br.dev.cristopher.loja.strategy.cristopher.imposto;

import br.dev.cristopher.loja.strategy.cristopher.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
