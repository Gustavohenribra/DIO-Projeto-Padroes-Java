package dio.projeto.padroes.strategy;

public class DescontoEstudante implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double preco) {
        return preco * 0.9; // 10% de desconto para estudantes
    }
}