package com.parasticaret.api.model.sitemodels;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class LogType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "logType", fetch = FetchType.LAZY)
    private Set<Log> logs;

    public LogType(Long id, String name, Set<Log> logs) {
        this.id = id;
        this.name = name;
        this.logs = logs;
    }

    public LogType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Log> getLogs() {
        return logs;
    }

    public void setLogs(Set<Log> logs) {
        this.logs = logs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogType logType = (LogType) o;
        return Objects.equals(id, logType.id) && Objects.equals(name, logType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
