package click.henriquegibi.webspringbootjpahibernate.repositories;

import click.henriquegibi.webspringbootjpahibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
