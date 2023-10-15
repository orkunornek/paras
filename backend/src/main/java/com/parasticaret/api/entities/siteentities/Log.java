package com.parasticaret.api.entities.siteentities;

import jakarta.persistence.*;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="logtype_id")
    private LogType logType;
    private String description;


}
