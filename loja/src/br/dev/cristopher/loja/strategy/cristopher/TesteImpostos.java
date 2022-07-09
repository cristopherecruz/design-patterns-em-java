package br.dev.cristopher.loja.strategy.cristopher;

import br.dev.cristopher.loja.strategy.cristopher.imposto.CalculadoraImposto;
import br.dev.cristopher.loja.strategy.cristopher.imposto.ICMS;
import br.dev.cristopher.loja.strategy.cristopher.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));

        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();

        System.out.println(calculadoraImposto.calcular(orcamento, new ICMS()));

    }

}
