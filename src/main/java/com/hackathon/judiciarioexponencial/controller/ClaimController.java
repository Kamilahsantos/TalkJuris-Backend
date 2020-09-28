package com.hackathon.judiciarioexponencial.controller;

import com.hackathon.judiciarioexponencial.model.Claim;
import com.hackathon.judiciarioexponencial.repository.ClaimRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ClaimController {

  @Autowired
  private ClaimRepository claimRepository;

  @ApiOperation(value = "Cria uma nova reclamação em nossa base")
  @ApiResponses(value = {
    @ApiResponse(code = 201, message = "Reclamação criada com sucesso"),
    @ApiResponse(code = 500, message = "Ocorreu um erro interno na criação da reclamação, nao foi possivel completar sua requisição")
  }
  )
  @PostMapping("/claim")
  public Claim createClaim(@Valid @RequestBody Claim claim) {
    return claimRepository.save(claim);
  }

  @ApiOperation(value = "Lista todas as reclamações em nossa base")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Reclamações listadas com sucesso "),
    @ApiResponse(code = 500, message = "Ocorreu um erro interno da listagem das reclamações, nao foi completar sua requisição")
  }
  )
  @GetMapping("/claim/list")
  public List<Claim> getAllClaim() {
    return claimRepository.findAll();
  }

}
