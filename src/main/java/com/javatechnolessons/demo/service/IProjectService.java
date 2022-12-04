package com.javatechnolessons.demo.service;

import java.util.List;

import javax.validation.Valid;

import com.javatechnolessons.demo.dto.ProjectDTO;

public interface IProjectService {
    public ProjectDTO save(@Valid ProjectDTO project);
    public ProjectDTO get(Long id);
    public ProjectDTO getNameDto(String name);
    public List<ProjectDTO> getAll();
    public void delete(Long id);

}
