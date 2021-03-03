package ua.kyiv.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.kyiv.app.domain.User;

@Repository
public interface UserRoleRepository extends CrudRepository<User, Long> {
	@Query("select a.role from UserRole a, User b where b.userName=?1 and a.userId = b.userId")
	public List<String> findRoleByUserName(String username);
}
