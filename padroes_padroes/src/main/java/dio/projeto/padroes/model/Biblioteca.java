package dio.projeto.padroes.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private static Biblioteca instancia;
    private List<Livro> catalogo;

    private Biblioteca() {
        this.catalogo = new ArrayList<>();
    }

    public static Biblioteca getInstance() {
        if (instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }

    public List<Livro> getCatalogo() {
        return catalogo;
    }
}
