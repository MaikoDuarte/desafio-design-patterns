package engineer.maiko.desafiodiodesignpatterns.api.repository;

import engineer.maiko.desafiodiodesignpatterns.api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
