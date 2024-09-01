package ck.dz.h2.repository;

import ck.dz.h2.entity.User;
import ck.dz.h2.entity.enums.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> findAllByCountryIsNot(Country country);


}
