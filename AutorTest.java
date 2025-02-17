package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AutorTest{
    @Test 
    public void testGetNacionalidade(){
    Autor autor = new Autor("Jess", "Brasileira");

    assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testGetObrasPublicadas(){
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);
        
        autor.addLivro(livro1);
        autor.addLivro(livro2);

        Livro[] esperado1 = {livro1};
        Livro[] resultado1 = {autor.getObrasPublicadas()[0]};

        Livro[] esperado2 = {livro2};
        Livro[] resultado2 = {autor.getObrasPublicadas()[1]};

        assertArrayEquals(esperado1, resultado1, "Primeiro array não condiz");
        assertArrayEquals(esperado2, resultado2, "Segundo array não condiz");
    }

    @Test
    public void testGetObrasPublicadasPorGenero(){
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Harry Potter", autor, "Fantasia", false);

        autor.addLivro(livro1);
        autor.addLivro(livro2);

        Livro[] esperado = {livro2};
        Livro[] resultado = {autor.getObrasPublicadasPorGenero("Fantasia")[0]};

        assertArrayEquals(esperado,resultado, "Array não condiz");
    }

    @Test
    public void testSetNacionalidade(){
        Autor autor = new Autor("Jess", "Brasileira");

        assertEquals("Brasileira", autor.getNacionalidade());
    }

}