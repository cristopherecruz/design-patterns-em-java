package br.dev.cristopher.loja.imposto;

import br.dev.cristopher.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
