
# ABE-Atividade-Final
> Atividades Final - Arquitetura de Backend e Microsserviços

## Docs

1. **API Loja** 		    -> *http://localhost:8080/loja/swagger-ui.html*
2. **API Fonecedor** 		-> *http://localhost:9090/fornecedor/swagger-ui.html*


## Docker commands

1. **API Loja** 		    
  - > *cd /loja*
  - > *docker build -f DockerFile -t app-loja .*
  - > *docker run -p 8080:8080 app-loja .*
2. **API Fonecedor** 	
  - > *cd /fornecedor*
  - > *docker build -f DockerFile -t app-fornecedor .*
  - > *docker run -p 9090:9090 app-fornecedor .*
