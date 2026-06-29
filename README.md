# Relógio Digital

Aplicação desktop simples feita com **JavaFX** (FXML + Controller) que exibe a data e hora atual, atualizando automaticamente a cada segundo.

## Funcionalidades

- Exibição de data e hora em tempo real (`dd-MM-yyyy HH:mm:ss`)
- Atualização automática a cada 1 segundo, usando `Timeline`

## Tecnologias utilizadas

- Java
- JavaFX (FXML + Controller)
- Maven

## Estrutura do projeto

```
digital-watch
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── digitalwatch
                    ├── WatchApplication.java
                    └── WatchController.java
        └── resources
            └── com
                └── digitalwatch
                    └── watch-view.fxml
```

## Como executar

### Via IntelliJ (painel Maven)

1. Abra o painel **Maven** na lateral direita do IntelliJ
2. Navegue até `digital-watch → Plugins → javafx`
3. Dê duplo clique em `javafx:run`

### Via terminal

```bash
mvn javafx:run
```

## Licença

Projeto de estudo, livre para uso e modificação.
