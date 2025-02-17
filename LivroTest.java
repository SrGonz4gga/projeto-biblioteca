package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class LivroTest{
    @Test 
    public void testGetTitulo(){
    Autor autor = new Autor("Jess", "Brasileira");
    Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

    assertEquals("Java Basico", livro1.getTitulo());
    }

    @Test
    public void testGetAutor(){
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        assertEquals(autor, livro1.getAutor());
    }

    @Test
    public void testGetGenero(){
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        assertEquals("tecnologia", livro1.getGenero());
    }

    @Test
    public void testIsDisponivel(){
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        assertTrue(livro1.isDisponivel(), "Não está disponível");
    }

    @Test
    public void testSetTitulo(){
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        assertEquals("Java Basico", livro1.getTitulo());
    }

    @Test
    public void testSetAutor(){
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        assertEquals(autor, livro1.getAutor());
    }

    @Test
    public void testSetGenero(){
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        assertEquals("tecnologia", livro1.getGenero());
    }
}