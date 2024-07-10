# Sobre o Projeto
Uma API restful de produtos que eu criei enquanto estudava sobre o Java Spring Boot, créditos à ![Michelli Brito](https://www.youtube.com/watch?v=wlYvA2b1BWI) pela excelente didática.

# O que foi utilizado
*SpringInitializer com SprintBoot 3, Java 17 e Maven
*Spring Web MVC
*Spring Data JPA
*Spring Validation
*Spring Hateoas

#Banco de Dados:
*Posgres
*Nome do esquema é "products-api" e senha "admin123"

# Endpoints
*POST   - http://localhost:8080/products
*GET    - http://localhost:8080/products
*GET    - http://localhost:8080/products/{id}
*PUT    - http://localhost:8080/products/{id}
*DELETE - http://localhost:8080/products/{id}

### Observação
O Spring Data JPA, quando eu iniciar a aplicação vai estar esperando por uma conexão com um banco de dados já, por isso eu especifico ela no application.properties. Não é necessário criar    