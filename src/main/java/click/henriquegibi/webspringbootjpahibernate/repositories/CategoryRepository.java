package click.henriquegibi.webspringbootjpahibernate.repositories;

import click.henriquegibi.webspringbootjpahibernate.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
