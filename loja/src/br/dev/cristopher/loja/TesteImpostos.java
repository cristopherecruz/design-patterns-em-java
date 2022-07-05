package br.dev.cristopher.loja;

import br.dev.cristopher.loja.imposto.CalculadoraImposto;
import br.dev.cristopher.loja.imposto.ICMS;
import br.dev.cristopher.loja.imposto.ISS;
import br.dev.cristopher.loja.imposto.Imposto;
import br.dev.cristopher.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));

        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();

        System.out.println(calculadoraImposto.calcular(orcamento, new ICMS()));

    }

}
