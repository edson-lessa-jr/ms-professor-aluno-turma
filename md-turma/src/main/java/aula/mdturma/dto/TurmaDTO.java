package aula.mdturma.dto;

import java.util.List;

public class TurmaDTO {
    private String nomeTurma;
    private String nomeProfessor;
    private List<String> nomeAlunos;

    public TurmaDTO(){}

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public List<String> getNomeAlunos() {
        return nomeAlunos;
    }

    public void setNomeAlunos(List<String> nomeAlunos) {
        this.nomeAlunos = nomeAlunos;
    }
}
