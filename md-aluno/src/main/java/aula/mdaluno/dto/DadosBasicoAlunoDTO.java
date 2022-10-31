package aula.mdaluno.dto;

import aula.mdaluno.model.Aluno;

public class DadosBasicoAlunoDTO {
    private Long id;
    private String nome;

    public DadosBasicoAlunoDTO(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
    }

    public DadosBasicoAlunoDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
