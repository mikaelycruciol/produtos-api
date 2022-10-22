package br.com.mikaely.produtos.repositories;

import br.com.mikaely.produtos.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos,Long> {
}
