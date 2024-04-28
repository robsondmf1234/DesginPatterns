package strategy.transportestrategy

import strategy.enuns.Priority

// Definição da classe Aereo que implementa a interface TransporteStrategy
class Aereo : TransporteStrategy {
    // Implementação do método fazendoTransporte da interface TransporteStrategy
    override fun fazendoTransporte(prioridade: Priority) {
        // Impressão de uma mensagem indicando que o transporte está sendo feito pelos céus e a prioridade do transporte
        println("Estou fazendo transporte pelos ceus. Prioridade: $prioridade")
    }
}
