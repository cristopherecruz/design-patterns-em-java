package br.dev.cristopher.loja.strategy.refactoringguru.routes;

public class WalkingStrategy implements RouteStrategy {

    @Override
    public String buildRoute(String localPartida, String destino) {
        return "Walking Strategy: " + localPartida + " " + destino;
    }

}
