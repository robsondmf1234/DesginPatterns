package strategy.transportestrategy

import strategy.enuns.Priority

// Definição da classe Maritimo que implementa a interface TransporteStrategy
class Maritimo : TransporteStrategy {
    // Implementação do método fazendoTransporte da interface TransporteStrategy
    override fun fazendoTransporte(prioridade: Priority) {
        // Impressão de uma mensagem indicando que o transporte está sendo feito pelos mares e a prioridade do transporte
        println("Estou fazendo transporte pelos mares. Prioridade: $prioridade")
    }
}