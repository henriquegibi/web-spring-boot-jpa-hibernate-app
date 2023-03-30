package click.henriquegibi.webspringbootjpahibernate.repositories;

import click.henriquegibi.webspringbootjpahibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
