package br.dev.cristopher.loja.strategy.refactoringguru.routes;

public class PublicTransport implements RouteStrategy {

    @Override
    public String buildRoute(String localPartida, String destino) {
        return "Public Transport Strategy: " + localPartida + " " + destino;
    }

}
