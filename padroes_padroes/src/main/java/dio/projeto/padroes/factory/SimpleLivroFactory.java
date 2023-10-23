package dio.projeto.padroes.factory;

import dio.projeto.padroes.model.Livro;

public class SimpleLivroFactory implements LivroFactory {
    @Override
    public Livro createLivro(String titulo, String autor, double preco) {
        return new Livro(titulo, autor, preco);
    }
}