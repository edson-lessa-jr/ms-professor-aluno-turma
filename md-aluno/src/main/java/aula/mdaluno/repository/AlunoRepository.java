package aula.mdaluno.repository;


import aula.mdaluno.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Aluno findFirstByNome(String nome);
}
