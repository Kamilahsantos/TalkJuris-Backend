package com.hackathon.judiciarioexponencial.repository;

import com.hackathon.judiciarioexponencial.model.Suggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuggestionRepository extends JpaRepository<Suggestion, Long> {
}
