package com.personal.Mycity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mainroute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mroute_id;
    private String route_name;
    @Lob
    private String picByte;
    private LocalDate createdAt;

    public Mainroute(String route_name, String picByte, LocalDate createdAt) {
        this.route_name = route_name;
        this.picByte = picByte;
        this.createdAt = createdAt;
    }
}
