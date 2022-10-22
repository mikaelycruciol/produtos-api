package br.com.mikaely.produtos.controlers;

import br.com.mikaely.produtos.models.Produtos;
import br.com.mikaely.produtos.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoControler {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/list")
    public List<Produtos> listarTodos(){
        return produtoService.listarTodos();
    }

    @PostMapping("/salvar")
    public ResponseEntity<?> cadastro(@RequestBody Produtos produtos){
        return produtoService.salvarProdutos(produtos);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Long id){
        produtoService.deletarProduto(id);

    }
}
