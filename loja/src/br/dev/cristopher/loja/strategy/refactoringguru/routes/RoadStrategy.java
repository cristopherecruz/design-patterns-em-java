package br.dev.cristopher.loja.strategy.refactoringguru.routes;

public class RoadStrategy implements RouteStrategy {

    @Override
    public String buildRoute(String localPartida, String destino) {
        return "Road Strategy: " + localPartida + " " + destino;
    }

}
