package strategy.transportestrategy

import strategy.enuns.Priority

// Definição da classe Rodoviario que implementa a interface TransporteStrategy
class Rodoviario() : TransporteStrategy {

    // Implementação do método fazendoTransporte da interface TransporteStrategy
    override fun fazendoTransporte(priority: Priority) {
        // Impressão de uma mensagem indicando que o transporte está sendo feito por estradas e a prioridade do transporte
        println("Estou fazendo transporte por estradas. Prioridade: $priority")
    }
}