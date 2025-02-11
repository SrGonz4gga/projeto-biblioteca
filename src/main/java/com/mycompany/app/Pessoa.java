class Pessoa{
    private String nome;
    private Livro[] livros;

    public String getNome(){
        return this.nome;
    }

    public Livro[] getLivros(){
        return livros;
    }

    public Livro[] getLivrosPorGenero(String genero){
        int c = 0;

        for (Livro livro: livros){
            if (livro.getGenero().equalsIgnoreCase(genero)){
                c++;
            }
        }

        Livro[] livrosFiltrados = new Livro[c];
        int indice = 0;
        for (Livro livro : livros){
            if (livro.getGenero().equalsIgnoreCase(genero)){
                livrosFiltrados[indice++] = livro;
            }
        }
        return livrosFiltrados; 
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}