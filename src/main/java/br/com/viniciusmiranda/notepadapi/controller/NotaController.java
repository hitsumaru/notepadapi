package br.com.viniciusmiranda.notepadapi.controller;

import br.com.viniciusmiranda.notepadapi.component.NotaComponent;
import br.com.viniciusmiranda.notepadapi.model.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "nota")
public class NotaController {

    @Autowired
    private NotaComponent notaComponent;

    @GetMapping
    private List<Nota> buscarTodos() {
        return notaComponent.buscarTodos();
    }

    @GetMapping(value = "/titulo/{titulo}")
    private Nota buscarNota(@PathVariable(value = "titulo") String titulo) {
        return notaComponent.buscarNota(titulo);
    }

    @PostMapping
    private void salvar(@RequestBody Nota nota) {
        notaComponent.salvar(nota);
    }

    @DeleteMapping
    private void apagarTodos() {
        notaComponent.apagarTodos();
    }

    @GetMapping(value = "/titulo/{titulo}")
    private void apagar(@PathVariable(value = "titulo") String titulo) {
        notaComponent.apagar(titulo);
    }
}
