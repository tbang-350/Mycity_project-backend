package com.personal.Mycity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subroute {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sroute_id;
    private String sroute_name;
    private Double latitude;
    private Double longitude;
    @Lob
    private String picByte;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "mainroute_subroutes",
            joinColumns =
            @JoinColumn(name = "sroute_id")
            ,
            inverseJoinColumns =
            @JoinColumn(name = "mroute_id")

    )
    private Set<Mainroute> mainroutes;

    private LocalDate createdAt;

    public Subroute(String sroute_name, Double latitude, Double longitude, String picByte, Set<Mainroute> mainroutes, LocalDate createdAt) {
        this.sroute_name = sroute_name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.picByte = picByte;
        this.mainroutes = mainroutes;
        this.createdAt = createdAt;
    }
}
