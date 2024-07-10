# Sobre o Projeto
Uma API RESTful de produtos que eu criei enquanto estudava sobre o Java Spring Boot, créditos à [Michelli Brito](https://www.youtube.com/watch?v=wlYvA2b1BWI) pela excelente didática.

# O que é uma API RESTful
Segundo Leonard Richardson, uma API RESTful, é uma API que adere aos princípios e restrições da arquitetura REST (Representational State Transfer), organizada em diferentes níveis de maturidade conforme descritos por Richardson e seu co-autor Sam Ruby.
No modelo de maturidade de Richardson, as APIs RESTful são classificadas em níveis, que são:
* ```Nível 0``` - Serviços baseados em URI: Neste nível, cada recurso (ou conjunto de recursos) é acessado por um único URI, sem distinção entre operações HTTP diferentes (como GET, POST, PUT, DELETE). Isso pode ser comparado a serviços baseados em RPC (Remote Procedure Call).
* ```Nível 1``` - Recursos por URI + Verbos HTTP: Aqui, os recursos são acessados por URIs específicos e operações HTTP começam a ser utilizadas (por exemplo, GET, POST, PUT, DELETE). No entanto, as operações não são necessariamente usadas de forma correta ou de acordo com o significado HTTP apropriado.
* ```Nível 2``` - Recursos, URI, Verbos HTTP e Cabeçalhos: Além de usar URIs para identificar recursos e verbos HTTP para operações, este nível inclui o uso apropriado de cabeçalhos HTTP, como headers de Content-Type e Accept, para indicar o formato dos dados enviados e aceitos pelo servidor.
* ```Nível 3``` - HATEOAS (Hypermedia as the Engine of Application State): Este é o nível mais avançado de maturidade. Aqui, a API não apenas utiliza URIs, verbos HTTP e cabeçalhos, mas também inclui links hipermídia que permitem a navegação dinâmica através da API. Em outras palavras, cada resposta da API contém links para os recursos relacionados, permitindo que o cliente descubra e interaja com a API de forma mais dinâmica.
Portanto, uma API RESTful segundo o modelo de maturidade de Leonard Richardson não é apenas uma questão de implementar operações HTTP padrão, mas também de seguir uma abordagem mais sofisticada que inclui a correta utilização de URIs, verbos HTTP, cabeçalhos e, idealmente, HATEOAS para oferecer uma experiência de desenvolvimento e integração mais flexível e eficiente.

# O que foi utilizado
* SpringInitializer com SprintBoot 3, Java 17 e Maven
* Spring Web MVC
* Spring Data JPA
* Spring Validation
* Spring Hateoas

#Banco de Dados:
* Posgres
* Nome do esquema é "products-api" e senha "admin123"

# Endpoints
* POST   - ```http://localhost:8080/products```
* GET    - ```http://localhost:8080/products```
* GET    - ```http://localhost:8080/products/{id}```
* PUT    - ```http://localhost:8080/products/{id}```
* DELETE - ```http://localhost:8080/products/{id}```

### Observação
O Spring Data JPA, quando eu iniciar a aplicação vai estar esperando por uma conexão com um banco de dados já, por isso eu especifico ela no application.properties. Não é necessário criar    