package aula.mdprofessor.repository;

import aula.mdprofessor.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    Professor findFirstByNome(String nome);
}
