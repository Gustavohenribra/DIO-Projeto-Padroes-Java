package dio.projeto.padroes.controller;

import dio.projeto.padroes.model.Biblioteca;
import dio.projeto.padroes.model.Livro;
import dio.projeto.padroes.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class BibliotecaController {

    @Autowired
    private BibliotecaService bibliotecaService;

    @GetMapping
    public List<Livro> listarLivros() {
        return Biblioteca.getInstance().getCatalogo();
    }

    @PostMapping
    public void adicionarLivro(@RequestParam String titulo, 
                               @RequestParam String autor, 
                               @RequestParam double preco, 
                               @RequestParam(defaultValue = "false") boolean capaDura) {
        bibliotecaService.adicionarLivro(titulo, autor, preco, capaDura);
    }
}
