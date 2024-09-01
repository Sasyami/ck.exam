package ck.dz.h2.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder

public class ServiceAddUserResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Integer code;
    private String message;


}
