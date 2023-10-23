package dio.projeto.padroes.decorator;

import dio.projeto.padroes.model.Livro;

public class LivroCapaDura extends Livro {
    private Livro livroBase;

    public LivroCapaDura(Livro livroBase) {
        super(livroBase.getTitulo(), livroBase.getAutor(), livroBase.getPreco() + 10); // Suponhamos que a capa dura adicione 10 ao preço
        this.livroBase = livroBase;
    }
}
