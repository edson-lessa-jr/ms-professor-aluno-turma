package aula.mdaluno.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
@Entity
public class Aluno {
    public static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    public Aluno(String nome, String dataNascimento) {
        this.nome = nome;
        this.setDataNascimento(dataNascimento);
    }

    public String getDataFormatada(){
        return this.dataNascimento.format(FORMATO_DATA);
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento, FORMATO_DATA);
    }
}
