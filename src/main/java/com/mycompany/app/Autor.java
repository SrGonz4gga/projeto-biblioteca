class Autor extends Pessoa {
    private String nacionalidade;

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public Livro[] getObrasPublicadas(){
        return this.getLivros();
    }

    public Livro[] getObrasPublicadasPorGenero(String genero){
        return this.getLivrosPorGenero(genero);
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
}
