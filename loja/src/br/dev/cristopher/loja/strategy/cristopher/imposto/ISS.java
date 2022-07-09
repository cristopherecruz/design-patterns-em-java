package br.dev.cristopher.loja.strategy.cristopher.imposto;

import br.dev.cristopher.loja.strategy.cristopher.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(("0.06")));
    }

}
