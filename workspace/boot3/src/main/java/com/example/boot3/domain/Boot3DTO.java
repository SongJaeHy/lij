package com.example.boot3.domain;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
public class Boot3DTO {

    private Long sno;

    private String first;

    private String last;

    private LocalDateTime regTime;
}
