package FatecFranca.Produto.service;

import FatecFranca.Produto.model.Produto;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private List<Produto> lista =  new ArrayList<Produto>();
    private Long nextId = 1L;

    public ProdutoService() {
        Produto produto = new Produto();
    }
    public List<Produto> listar() {
        return this.lista;
    }

    public Produto criar (Produto p){
        p.setId(nextId); //insere Id
        nextId++; // atualiza id
        this.lista.add(p); // adiciona na lista
        return p; // retorna produto
    }

    public Produto buscarPorId(Long id) {
        return lista.stream().filter(p -> p.getId().equals(id))
                .findFirst().orElse(null);
    }
}
