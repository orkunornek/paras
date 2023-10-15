package com.parasticaret.api.entities.siteentities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class LogType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "logType", fetch = FetchType.LAZY)
    private Set<Log> logs;

}
