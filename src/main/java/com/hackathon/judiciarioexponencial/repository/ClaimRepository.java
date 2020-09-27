package com.hackathon.judiciarioexponencial.repository;

import com.hackathon.judiciarioexponencial.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {
}
