package com.projectmannage.ProjetMannage.domain.entity;

import com.projectmannage.ProjetMannage.Model.TaskStatus;

import java.time.LocalDate;

public class Taks {
    private String id;
    private String title;
    private String descrition;
    private Integer numberofDays;
    private TaskStatus status;
    private Project project;
    private Member assignMenber;
}



