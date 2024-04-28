package strategy.transportestrategy

import strategy.enuns.Priority

// Definição da interface TransporteStrategy
interface TransporteStrategy {
    // Método abstrato fazendoTransporte que recebe um parâmetro do tipo Priority
    fun fazendoTransporte(prioridade: Priority)
}