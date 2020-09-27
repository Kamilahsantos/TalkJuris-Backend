package com.hackathon.judiciarioexponencial.controller;

import com.hackathon.judiciarioexponencial.model.Claim;
import com.hackathon.judiciarioexponencial.model.Suggestion;
import com.hackathon.judiciarioexponencial.repository.SuggestionRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SuggestionController {

  @Autowired
  private SuggestionRepository suggestionRepository;

  @ApiOperation(value = "Cria uma nova sugestao em nossa base")
  @ApiResponses(value = {
    @ApiResponse(code = 201, message = "sugestao criada com sucesso"),
    @ApiResponse(code = 500, message = "Ocorreu um erro interno na criacao da sugestao, nao foi possivel completar sua requisicao")
  }
  )
  @PostMapping("/suggestion")
  public Suggestion createSuggestion(@Valid @RequestBody Suggestion suggestion) {
    return suggestionRepository.save(suggestion);
  }

  @ApiOperation(value = "Lista todas as sugestoes em nossa base")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "sugestoes listadas com sucesso "),
    @ApiResponse(code = 500, message = "ocorreu um erro interno da listagem das sugestoes, nao foi completar sua requisicao")
  }
  )
  @GetMapping("/suggestion/list")
  public List<Suggestion> getAllSuggestion() {
    return suggestionRepository.findAll();
  }

}
