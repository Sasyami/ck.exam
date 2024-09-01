package ck.dz.h2.entity;

import ck.dz.h2.entity.enums.Country;
import ck.dz.h2.entity.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="USR")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column(name="usrcountry")
    @Enumerated(EnumType.STRING)
    private Country country;
    @Column(name="age")
    private Integer age;

}
