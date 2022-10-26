# Exemplo Microserviços em Spring boot
## Utiliza-se
* ConfigServer para banco em configuração em arqiuvo local porta 9090
* Banco H2 persistindo em disco
* Eureka Service Discovery porta 8761
* Spring Gateway porta 8080
* Microservice aluno porta 9092
* Microservice professor porta 9091
* Microservice turma porta 9095

### Incluir professor
#### Method POST localhost:8080/professor/
* Body

{
"nome": "Patryck",
"dataNascimento": "01/05/1980",
"especialidades": ["PHP","JAVA"]

}

### Recuperar professor
#### Method GET localhost:8080/professor/


### Incluir aluno
#### Method POST localhost:8080/aluno/
* Body

{
"nome": "João",
"dataNascimento": "01/02/1990"
}

### Recuperar aluno
#### Method GET localhost:8080/aluno/


### Incluir turma
#### Method POST localhost:8080/turma/
* Body

{
"nomeTurma": "MS",
"nomeProfessor": "Patryck",
"nomeAlunos": ["Edson"]
}

### Recuperar turma
#### Method GET localhost:8080/turma/
