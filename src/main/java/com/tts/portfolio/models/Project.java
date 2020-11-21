package com.tts.portfolio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name="project_id")
        private Long id;

    @Column(name="title")
        private String title;

    @Column(name="description")
        private String description;

    @Column(name="imageURL")
        private String imageURL;
    
    @Column(name="githubURL")
        private String githubURL;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImageURL() {
            return imageURL;
        }

        public void setImageURL(String imageURL) {
            this.imageURL = imageURL;
        }

        public String getGithubURL() {
            return githubURL;
        }

        public void setGithubURL(String githubURL) {
            this.githubURL = githubURL;
        }

        @Override
        public String toString() {
            return "Project [description=" + description + ", githubURL=" + githubURL + ", id=" + id + ", imageURL="
                    + imageURL + ", title=" + title + "]";
        }

        public Project() {
        }

        public Project(Long id, String title, String description, String imageURL, String githubURL) {
            this.id = id;
            this.title = title;
            this.description = description;
            this.imageURL = imageURL;
            this.githubURL = githubURL;
        }

}
