package dio.projeto.padroes.service;

import org.springframework.stereotype.Service;

import dio.projeto.padroes.decorator.LivroCapaDura;
import dio.projeto.padroes.factory.SimpleLivroFactory;
import dio.projeto.padroes.model.Biblioteca;
import dio.projeto.padroes.model.Livro;

@Service
public class BibliotecaService {
    private SimpleLivroFactory livroFactory = new SimpleLivroFactory();

    public void adicionarLivro(String titulo, String autor, double preco, boolean capaDura) {
        Livro livro = livroFactory.createLivro(titulo, autor, preco);
        if (capaDura) {
            livro = new LivroCapaDura(livro);
        }
        Biblioteca.getInstance().getCatalogo().add(livro);
    }
}
