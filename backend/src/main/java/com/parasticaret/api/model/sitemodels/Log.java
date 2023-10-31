package com.parasticaret.api.model.sitemodels;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="logtype_id")
    private LogType logType;
    private String description;

    public Log(Long id, LogType logType, String description) {
        this.id = id;
        this.logType = logType;
        this.description = description;
    }

    public Log() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LogType getLogType() {
        return logType;
    }

    public void setLogType(LogType logType) {
        this.logType = logType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(id, log.id) && Objects.equals(logType, log.logType) && Objects.equals(description, log.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, logType, description);
    }
}
