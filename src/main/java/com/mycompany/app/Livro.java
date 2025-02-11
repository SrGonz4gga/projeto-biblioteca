class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;

    public String getTitulo(){
        return this.titulo;
    }

    public Autor getAutor(){
        return this.autor;
    }

    public String getGenero(){
        return this.genero;
    }

    public void validarDisponibilidade(boolean x){
        disponivel = x;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

}
