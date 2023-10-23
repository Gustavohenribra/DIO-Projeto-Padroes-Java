package dio.projeto.padroes.strategy;

public class DescontoBlackFriday implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double preco) {
        return preco * 0.8; // 20% de desconto na Black Friday
    }
}