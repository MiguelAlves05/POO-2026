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

    public boolean remover(Long id){
        for(int i = 0; i < this.lista.size(); i++){
            if(lista.get(i).getId().equals(id)){
                this.lista.remove(i);
                return true;
            }
        }
        return false;
    }

    public Produto buscarPorId(Long id) {
        return lista.stream().filter(p -> p.getId().equals(id))
                .findFirst().orElse(null);
    }
    public Produto atualizar(Long id, Produto novo){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getId().equals(id)){
                novo.setId(id);
                lista.set(i, novo);
                return novo;
            }
        }
        return null;
    }
}
