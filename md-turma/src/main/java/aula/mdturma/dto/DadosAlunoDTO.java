package aula.mdturma.dto;

public class DadosAlunoDTO {
    private Long id;
    private String nome;

    public DadosAlunoDTO() {
    }

    public DadosAlunoDTO(String nome) {
        this.nome = nome;
    }

    public DadosAlunoDTO(Long id) {
        this.id = id;
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
