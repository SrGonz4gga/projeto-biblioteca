public class Main{
    public static void main(String[] args){
        Usuario usuario1 = new Usuario();
        usuario1.setNome("Vinícius");
        usuario1.setIdade(19);

        Autor autor1 = new Autor();
        autor1.setNome("Jessica Felix");

        Livro livro1 = new Livro();
        livro1.setTitulo("Java for Beginners");
        livro1.setAutor(autor1);
        livro1.setGenero("Tecnologia");

        Emprestimo emprestimo1 = new Emprestimo();
        emprestimo1.setDataDevolucao();
        emprestimo1.setDataRetirada();

        boolean disponivel = livro1.isDisponivel();
        
        if (disponivel == true){
        System.out.println("Livro disponível");
        }
        else{
        System.out.println("Livro Indisponível");
        }
        System.out.println("Livro: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor().getNome());
        System.out.println("Genero " + livro1.getGenero());
        System.out.println("Usuario " + usuario1.getNome());
        System.out.println("Idade " + usuario1.getIdade());
        System.out.println("Data de Retirada: " + emprestimo1.getDataRetirada());
        System.out.println("Data de devolução " + emprestimo1.getDataDevolucao());
    }

}