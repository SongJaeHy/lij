package com.example.boot3.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
public class BoDTO {

    private Long bno;

    private Long sno;

    private String name;

    private LocalDateTime regDate;

}
