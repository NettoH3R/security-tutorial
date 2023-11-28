package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Indica que esta classe é uma tabela do banco
@Table(name = "users") // Especifica a tabela do banco de dados

public class User {
    @Id // Indica que o campo abaixo é a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia de geração de valor para a chave primária
    private long id; // Campo representando a chave primária da tabela

    private String username; // Campo para armazenar o nome de usuário
    private String password; // Campo para armazenar a senha do usuário

    // Gets e Sets para acessar e modificar os campos privados

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
}