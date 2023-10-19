package dev.gabsdocompiuter.awsRdsNewsletter.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Subscriber {
    private Integer id;
    private String email;
}
