package com.projectmannage.ProjetMannage.applicationservice;

import com.projectmannage.ProjetMannage.Model.ProjectStatus;
import com.projectmannage.ProjetMannage.domain.entity.Project;
import com.projectmannage.ProjetMannage.infrastructure.dto.SaveProjectDataDTO;
import com.projectmannage.ProjetMannage.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Transactional
    public Project createProject(SaveProjectDataDTO saveProjectData){
        Project project = Project
                .builder()
                .name(saveProjectData.getName())
                .description(saveProjectData.getDescription())
                .initialDate(saveProjectData.getInitialDate())
                .finalDate(saveProjectData.getInitialFinal())
                .status(ProjectStatus.PEDDING)
                .build();

        projectRepository.save(project);
        return project;
    }
}