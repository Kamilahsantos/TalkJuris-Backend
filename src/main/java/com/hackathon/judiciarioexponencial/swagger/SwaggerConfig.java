package com.hackathon.judiciarioexponencial.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
      .select()
      .apis(RequestHandlerSelectors.basePackage("com.hackathon.judiciarioexponencial.controller"))
      .paths(PathSelectors.any())
      .build()
      .useDefaultResponseMessages(true)
      .apiInfo(apiInfo());
  }

  private ApiInfo apiInfo(){

    return new ApiInfoBuilder()
      .title("talkJuris")
      .description("TalkJuris é uma solução que visa simplificar a consulta de andamento de processos no judiciário por meio de um algoritmo de busca e da secretária jurídica virtual Ju, é possível fazer essa consulta utlizando somente o WhatsAPP além de poder deixar dúvidas, sugestões e reclamações. ")
      .version("1.0.0")
      .license("Apache License Version 2.0")
      .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
      .contact(new Contact("Github", "https://github.com/Kamilahsantos/TalkJuris-Backend",null))
      .build();

  }
}
