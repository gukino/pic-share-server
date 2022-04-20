package hku.picshare.dao;

import hku.picshare.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Author hqj
 *
 */

@Repository
public interface UserDAO extends JpaRepository<User, Integer>, JpaSpecificationExecutor {
    User getUserById(int id);

}
