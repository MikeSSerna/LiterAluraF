package com.maico.LiterAlura.repository;

import com.maico.LiterAlura.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Repositorio para la entidad Book. Permite realizar operaciones CRUD
 * y consultas personalizadas sobre la base de datos.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    /**
     * Encuentra libros que contienen un fragmento en el título.
     *
     * @param title El título o fragmento de título a buscar.
     * @return Lista de libros que contienen el fragmento en el título.
     */
    List<Book> findByTitleContainingIgnoreCase(String title);

    /**
     * Encuentra libros por autor.
     *
     * @param author El autor de los libros.
     * @return Lista de libros escritos por el autor.
     */
    List<Book> findByAuthorIgnoreCase(String author);

    /**
     * Encuentra libros publicados en un año específico.
     *
     * @param year El año de publicación.
     * @return Lista de libros publicados en el año especificado.
     */
    List<Book> findByYearPublished(int year);
}

