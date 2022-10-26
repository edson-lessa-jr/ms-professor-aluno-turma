package aula.mdturma.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
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

}
