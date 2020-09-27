package com.hackathon.judiciarioexponencial.model;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "claim")
public class Claim {

  private Long id;
  private String title;
  private String description;
  private String subject;
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
  @Column(name = "subject", length = 255, nullable = false)
  @NotNull(message = "Please input a subject")
  @Size(max = 255)
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
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

  public Claim() {
  }


  public Claim(Long id, String title, String description, String subject, LocalDateTime created_at, LocalDateTime updatedAt) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.subject = subject;
    this.created_at = created_at;
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Claim [id=" + id + ", title=" + title + ", description=" + description + ", subject=" + subject + ", created_at=" +created_at
      + ", updatedAt=" + updatedAt    + "]";
  }


}
