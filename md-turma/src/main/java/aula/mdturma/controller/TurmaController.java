package aula.mdturma.controller;

import aula.mdturma.dto.InfoTurmaDTO;
import aula.mdturma.dto.TurmaDTO;
import aula.mdturma.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    @Autowired
    private TurmaService turmaService;

    @PostMapping("/")
    public void incluirTurma(@RequestBody TurmaDTO dto){
        turmaService.registrarTurma(dto);
    }

    @GetMapping("/")
    public List<InfoTurmaDTO> listarTodasAsTurmas(){
        return turmaService.listarTodas();
    }
}
