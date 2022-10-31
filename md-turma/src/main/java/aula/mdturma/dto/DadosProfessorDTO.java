package aula.mdturma.dto;

public class DadosProfessorDTO {
    private Long id;
    private String nome;

    public DadosProfessorDTO(){}

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

    @Override
    public String toString() {
        return "DadosProfessorDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
