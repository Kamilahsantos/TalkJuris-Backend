package com.hackathon.judiciarioexponencial.model;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "suggestion")
public class Suggestion {

  private Long id;
  private String title;
  private String description;
  private LocalDateTime created_at;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "title", length = 255, nullable = false)
  @NotNull(message = "Please input a title")
  @Size(max = 255)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Column(name = "description", length = 255, nullable = false)
  @NotNull(message = "Please input a description")
  @Size(max = 255)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Column(name = "created_at", updatable = false)
  @CreatedDate
  @CreationTimestamp
  public LocalDateTime getCreated_at() {
    return created_at;
  }

  public void setCreated_at(LocalDateTime created_at) {
    this.created_at = created_at;
  }

  @Column(name = "updatedAt", nullable = true)
  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  private LocalDateTime updatedAt;

  public Suggestion() {
  }


  public Suggestion(Long id, String title, String description,  LocalDateTime created_at, LocalDateTime updatedAt) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.created_at = created_at;
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Claim [id=" + id + ", title=" + title + ", description=" + description + ", created_at=" +created_at
      + ", updatedAt=" + updatedAt    + "]";
  }


}
