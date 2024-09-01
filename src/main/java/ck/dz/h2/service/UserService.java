package ck.dz.h2.service;

import ck.dz.h2.entity.User;
import ck.dz.h2.entity.enums.Country;
import ck.dz.h2.repository.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Getter
@Setter
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    public User addUser(User user){
        return repository.save(user);
    }
    public List<User> findAll(){
        return repository.findAll();
    }
    public Optional<User> findById(Long id){
        return repository.findById(id);
    }
    public List<User> findByNotCountry(Country country){
        return repository.findAllByCountryIsNot(country).stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
    }


}
