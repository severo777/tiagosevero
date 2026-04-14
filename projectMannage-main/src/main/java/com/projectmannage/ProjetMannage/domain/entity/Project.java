package com.projectmannage.ProjetMannage.domain.entity;

import com.projectmannage.ProjetMannage.MODEL.ProjectStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    public Project() {

    }

    public Project(String id, String name, String description, LocalDate initial_date, LocalDate final_date, ProjectStatus status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.initial_date = initial_date;
        this.final_date = final_date;
        this.status = status;
    }



    private String id;
    private String name;
    private String description;
    private LocalDate initial_date;
    private LocalDate final_date;
    private ProjectStatus status;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id);
    }

}
