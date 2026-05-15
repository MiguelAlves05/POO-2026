package com.Atividade1.clientes_api.controller;

import com.Atividade1.clientes_api.model.Cliente;
import com.Atividade1.clientes_api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> getClientes(){
        return ResponseEntity.ok(clienteService.listar());
    }
    @PostMapping
    public ResponseEntity<Cliente> criar (@RequestBody Cliente cliente){
        Cliente criado = clienteService.criar(cliente);
        URI uri = URI.create("/clientes/"+cliente.getId());
        return ResponseEntity.created(uri).body(criado);
    }
    @DeleteMapping
    public ResponseEntity<Void> remover(@PathVariable Long id){
        return clienteService.remover(id) ?
                ResponseEntity.noContent().build() :
                ResponseEntity.notFound().build();
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(
            @PathVariable Long id,
            @RequestBody Cliente cliente
    ){
        Cliente ret =  clienteService.atualizar(id, cliente);
        if (ret == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(ret);
        }

    }

}
