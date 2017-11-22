package br.com.viniciusmiranda.notepadapi.repository;

import br.com.viniciusmiranda.notepadapi.model.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NotaRepository extends MongoRepository<Nota, String>{

    List<Nota> findByTitulo(String titulo);

}
