package ua.kyiv.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.kyiv.app.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUserName(String userName);
}