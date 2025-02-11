import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public LocalDate getDataRetirada(){
        return this.dataRetirada;
    }

    public LocalDate getDataDevolucao(){
        return this.dataDevolucao;
    }

    public Livro getLivro(){
        return this.livro;
    }

    public Usuario getUsuario(){
        return this.usuario;
    }

    public void setDataDevolucao() {
        this.dataDevolucao = LocalDate.now();
    }

    public void setDataRetirada() {
        this.dataRetirada = LocalDate.now();
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }



}
