package com.personal.Mycity.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Lob;
import java.time.LocalDate;

@Data
public class MainrouteDto {
    private String route_name;
    private LocalDate createdAt;
    private MultipartFile imgBytes;
}
