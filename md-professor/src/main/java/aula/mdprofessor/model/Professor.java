package aula.mdprofessor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Professor {

    public static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    @Column(name = "especialidade_nome")
    private List<Especialidade> especialidades = new ArrayList<>();

    public String getDataNascimentoFormada(){
        return this.dataNascimento.format(FORMATO_DATA);
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = LocalDate.parse(dataNascimento, FORMATO_DATA);
    }

    public void adicionarEspecialidade(Especialidade especialidade){
        this.especialidades.add(especialidade);
    }
}
