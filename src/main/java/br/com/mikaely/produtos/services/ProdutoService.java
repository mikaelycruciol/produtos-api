package br.com.mikaely.produtos.services;

import br.com.mikaely.produtos.models.Produtos;
import br.com.mikaely.produtos.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produtos> listarTodos(){
        return produtoRepository.findAll();
    }

    public ResponseEntity<Produtos> salvarProdutos(Produtos produtos){
        return new ResponseEntity<Produtos>(produtoRepository.save(produtos), HttpStatus.CREATED);
    }

    public void deletarProduto(Long id){
        Produtos produtos = new Produtos();
        produtos.setId(id);
        produtoRepository.delete(produtos);
    }
}
