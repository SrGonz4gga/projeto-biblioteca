package com.mycompany.app;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UsuarioTest{
    @Test 
    public void testGetIdade(){
    Usuario usuario = new Usuario("Vinícius", 19);

    assertEquals(19, usuario.getIdade());
    }

    @Test
    public void testSetIdade(){
        Usuario usuario = new Usuario("Vinícius", 19);

        assertEquals(19, usuario.getIdade());
    }

    @Test
    public void testGetHistoricoEmprestimos(){
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
        usuario.addEmprestimo(emprestimo);

        Emprestimo[] esperado = {emprestimo};
        Emprestimo[] resultado = {usuario.getHistoricoEmprestimos()[0]}; 

        assertArrayEquals(esperado, resultado, "Array não condiz");
    }

}