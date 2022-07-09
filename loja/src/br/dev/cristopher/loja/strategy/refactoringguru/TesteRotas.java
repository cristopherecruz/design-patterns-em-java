package br.dev.cristopher.loja.strategy.refactoringguru;

import br.dev.cristopher.loja.strategy.refactoringguru.navigator.Navigator;
import br.dev.cristopher.loja.strategy.refactoringguru.routes.PublicTransport;

public class TesteRotas {

    public static void main(String[] args) {

        Navigator navigator = new Navigator();
        String route = navigator.buildRoute("Jaraguá do Sul", "Joinville", new PublicTransport());

        System.out.println(route);

    }

}
