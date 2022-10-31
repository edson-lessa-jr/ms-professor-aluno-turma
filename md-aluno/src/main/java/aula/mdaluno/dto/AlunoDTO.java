package aula.mdaluno.dto;


import aula.mdaluno.model.Aluno;

public class AlunoDTO {
    private String nome;
    private String dataNascimento;

    public AlunoDTO(Aluno aluno) {
        this.nome = aluno.getNome();
        this.dataNascimento = aluno.getDataFormatada();
    }

    public Aluno converterParaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(this.nome);
        aluno.setDataNascimento(this.dataNascimento);
        return aluno;
    }

    public AlunoDTO() {
    }

    public AlunoDTO(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    @Override
    public String toString() {
        return "AlunoDTO{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
