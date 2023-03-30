package click.henriquegibi.webspringbootjpahibernate.repositories;

import click.henriquegibi.webspringbootjpahibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
