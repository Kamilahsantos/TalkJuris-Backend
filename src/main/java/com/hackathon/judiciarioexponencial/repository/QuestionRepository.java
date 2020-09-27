package com.hackathon.judiciarioexponencial.repository;

import com.hackathon.judiciarioexponencial.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
