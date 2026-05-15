package com.Atividade1.clientes_api.service;

import com.Atividade1.clientes_api.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();
    private Long nextId = 1L;

    public ClienteService() {
        Cliente cliente = new Cliente();
    }

    public List<Cliente> listar() {
        return this.clientes;
    }

    public Cliente criar(Cliente c) {
        c.setId(nextId++);
        nextId++;
        this.clientes.add(c);
        return c;
    }

    public boolean remover(Long id) {
        for(int i = 0; i < this.clientes.size(); i++) {
            if(clientes.get(i).getId().equals(id)) {
                this.clientes.remove(i);
                return true;
            }
        }
        return false;
    }

    public Cliente buscarPorId(Long id) {
        return this.clientes.stream().filter(c -> c.getId().equals(id))
                .findFirst().orElse(null);

    }

    public Cliente atualizar(Long id, Cliente novo) {
        for(int i = 0; i < listar().size(); i++) {
            if(clientes.get(i).getId().equals(id)) {
                novo.setId(id);
                clientes.set(i, novo);
                return novo;
            }
        }
        return null;
    }

}
