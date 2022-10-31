package aula.mdprofessor.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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

    public Professor() {
    }

    public Professor(Long id, String nome, LocalDate dataNascimento, List<Especialidade> especialidades) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.especialidades = especialidades;
    }

    public String getDataNascimentoFormada(){
        return this.dataNascimento.format(FORMATO_DATA);
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = LocalDate.parse(dataNascimento, FORMATO_DATA);
    }

    public void adicionarEspecialidade(Especialidade especialidade){
        this.especialidades.add(especialidade);
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }
}
