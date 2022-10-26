package aula.mdprofessor.controller;

import aula.mdprofessor.dto.ProfessorDTO;
import aula.mdprofessor.model.Professor;
import aula.mdprofessor.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/{id}")
    public ProfessorDTO localizarProfessor(@PathVariable(name = "id") Long id){
        Professor professor = professorRepository.getById(id);
        ProfessorDTO professorDTO = new ProfessorDTO(professor);
        return professorDTO;
    }
    @GetMapping("/nome/{nome}")
    public ProfessorDTO localizarProfessorPorNome(@PathVariable(name = "nome")String nome){
        Professor professor = professorRepository.findFirstByNome(nome);
        return new ProfessorDTO(professor);
    }
    @GetMapping("/")
    public List<ProfessorDTO> listarProfessors(){
        List<ProfessorDTO> professorDTOS = new ArrayList<>();
        List<Professor> professorList = professorRepository.findAll();
        for(Professor professor: professorList){
            ProfessorDTO professorDTO = new ProfessorDTO(professor);
            professorDTOS.add(professorDTO);
        }
        return professorDTOS;
    }

    @PostMapping("/")
    public void gravarProfessor(@RequestBody ProfessorDTO dto){
        Professor professor = dto.converteParaProfessor(dto);
        professorRepository.save(professor);
    }
}
