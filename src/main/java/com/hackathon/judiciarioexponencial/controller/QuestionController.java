package com.hackathon.judiciarioexponencial.controller;

import com.hackathon.judiciarioexponencial.model.Question;
import com.hackathon.judiciarioexponencial.repository.QuestionRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class QuestionController {

  @Autowired
  private QuestionRepository questionRepository;


  @ApiOperation(value = "Cria uma nova duvida em nossa base")
  @ApiResponses(value = {
    @ApiResponse(code = 201, message = "duvida criada com sucesso"),
    @ApiResponse(code = 500, message = "Ocorreu um erro interno na criacao da duvida, nao foi possivel completar sua requisicao")
  }
  )
  @PostMapping("/question")
  public Question createQuestion(@Valid @RequestBody Question question) {
    return questionRepository.save(question);
  }

  @ApiOperation(value = "Lista todas as duvidas em nossa base")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Duvidas listadas com sucesso "),
    @ApiResponse(code = 500, message = "ocorreu um erro interno da listagem das duvidas, nao foi completar sua requisicao")
  }
  )
  @GetMapping("/question/list")
  public List<Question> getAllQuestion() {
    return questionRepository.findAll();
  }


}
