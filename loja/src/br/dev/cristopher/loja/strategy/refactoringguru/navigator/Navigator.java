package br.dev.cristopher.loja.strategy.refactoringguru.navigator;

import br.dev.cristopher.loja.strategy.refactoringguru.routes.RouteStrategy;

public class Navigator {

    public String buildRoute(String localPartida, String destino, RouteStrategy routeStrategy) {
        return routeStrategy.buildRoute(localPartida, destino);
    }

}
