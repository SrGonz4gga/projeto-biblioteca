class Usuario extends Pessoa{
    private int idade;
    private Emprestimo[] historicoEmprestimos;

    public int getIdade(){
        return this.idade;
    }

    public Emprestimo[] getHistoricoEmprestimos(){
        return historicoEmprestimos;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
