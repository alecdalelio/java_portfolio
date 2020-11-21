package com.tts.portfolio.controllers;

import java.util.ArrayList;

import com.tts.portfolio.models.Project;
import com.tts.portfolio.repositories.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private ProjectRepository projectRepository;
    private static ArrayList<Project> projects = new ArrayList<>();
    
    @GetMapping("/")
    public String index(Project project, Model model) {

        projects.removeAll(projects);

        for(Project projectFromDB : projectRepository.findAll()) {
            projects.add(projectFromDB);
        }

        model.addAttribute("projects", projects);
        return "index";
    }

    @GetMapping("/about")
    public String aboutMe() {
        return "about";
    }

    @GetMapping("/mywork")
    public String myWork() {
        return "mywork";
    }

    @GetMapping("/contact")
    public String contactMe() {

        return "contact";
    }

    @GetMapping(value = "/private/newproject")
    public String newBlog(Project project) {
        return "new";
    }

    @RequestMapping(value = "blogpost/delete/{id}")
    public String deletePostWithId(@PathVariable Long id, Project project) {
        projectRepository.deleteById(id);
        return "deleted";
    }

    @PostMapping(value = "/private/mywork")
    public String create(Project project, Model model) {

        System.out.println(project);
        projectRepository.save(project);
        projects.add(project);
        model.addAttribute("title", project.getTitle());
        model.addAttribute("description", project.getDescription());
        model.addAttribute("imageURL", project.getImageURL());
        model.addAttribute("githubURL", project.getGithubURL());
            return "index";
    }

}
