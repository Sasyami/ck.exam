package ck.dz.h2.dto;

import ck.dz.h2.entity.User;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder

public class ServiceGetCountryNotResponse {
    List<User> users;
    String message;

}
