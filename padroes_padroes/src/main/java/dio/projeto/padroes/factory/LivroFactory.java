package dio.projeto.padroes.factory;

import dio.projeto.padroes.model.Livro;

public interface LivroFactory {
    Livro createLivro(String titulo, String autor, double preco);
}
