package aula.mdturma.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nome;
    @Column(name = "professor_id")
    private Long professorID;

    @ElementCollection
    private Set<Long> matriculaAlunos;

    public Turma() {
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

    public Long getProfessorID() {
        return professorID;
    }

    public void setProfessorID(Long professorID) {
        this.professorID = professorID;
    }

    public Set<Long> getMatriculaAlunos() {
        return matriculaAlunos;
    }

    public void setMatriculaAlunos(Set<Long> matriculaAlunos) {
        this.matriculaAlunos = matriculaAlunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professorID=" + professorID +
                ", matriculaAlunos=" + matriculaAlunos +
                '}';
    }
}
