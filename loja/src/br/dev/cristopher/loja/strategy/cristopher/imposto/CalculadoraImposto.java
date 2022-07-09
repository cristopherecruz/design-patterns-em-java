package br.dev.cristopher.loja.strategy.cristopher.imposto;

import br.dev.cristopher.loja.strategy.cristopher.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }

}
