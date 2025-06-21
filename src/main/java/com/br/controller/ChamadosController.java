package com.br.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.br.exception.ResourceNotFoundException;
import com.br.model.Chamados;
import com.br.repository.ChamadosRepository;

@RequestMapping("/chcontroller/")
@CrossOrigin(origins = "*")
@RestController
public class ChamadosController {

    @Autowired
    private ChamadosRepository chRep;

    // Listar todos os chamados
    @GetMapping("/chamados")
    public List<Chamados> listar() {
        return this.chRep.findAll();
    }

    // Inserir um novo chamado
    @PostMapping("/chamados")
    public Chamados inserir(@RequestBody Chamados chamados) {
        return chRep.save(chamados);
    }

    // Excluir um chamado por ID
    @DeleteMapping("/chamados/{id}")
    public ResponseEntity<Map<String, Boolean>> excluir(@PathVariable Long id) {
        Chamados chamados = chRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Chamado não encontrado: " + id));

        chRep.delete(chamados);

        Map<String, Boolean> resposta = new HashMap<>();
        resposta.put("excluido", Boolean.TRUE);
        return ResponseEntity.ok(resposta);
    }

    // Alterar um chamado
    @PutMapping("/chamados/{id}")
    public ResponseEntity<Chamados> alterar(@PathVariable Long id, @RequestBody Chamados chamados) {
        Chamados cha = chRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Chamado não encontrado: " + id));

        cha.setTitulo(chamados.getTitulo());
        cha.setDescricao(chamados.getDescricao());
        cha.setCliente(chamados.getCliente());
        cha.setData_abertura(chamados.getData_abertura());
        cha.setData_encerramento(chamados.getData_encerramento());

        Chamados atualizado = chRep.save(cha);
        return ResponseEntity.ok(atualizado);
    }

    // Buscar um chamado específico por ID
    @GetMapping("/chamados/{id}")
    public ResponseEntity<Chamados> buscarPorId(@PathVariable Long id) {
        Chamados chamados = chRep.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Chamado não encontrado: " + id));
        return ResponseEntity.ok(chamados);
    }
}
