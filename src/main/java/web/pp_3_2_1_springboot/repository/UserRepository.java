package web.pp_3_2_1_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.pp_3_2_1_springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
