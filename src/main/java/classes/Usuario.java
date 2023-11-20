/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author vieir
 */
public class Usuario {
     // Atributos
    private int codUsu;
    protected String nome;
    protected String login;
    protected String senha;
    protected String email;

    // Construtor
    public Usuario(String nome, String login, String senha, String email) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    public Boolean cadastrarUsuario() {
        // Lógica para cadastrar o usuário (pode ser implementada posteriormente)
        System.out.println("Usuário cadastrado com sucesso!");
        
        this.codUsu = 0; //ID RETORNADO DO BANCO
        return true;
    }

    public Boolean excluirUsuario() {
        // Lógica para excluir o usuário (pode ser implementada posteriormente)
        System.out.println("Usuário "+ this.nome +" excluído com sucesso!");
        return true;
    }

    public void editarUsuario(String novoNome, String novoLogin, String novaSenha, String novoEmail) {
        // Lógica para editar o usuário (pode ser implementada posteriormente)
        this.nome = novoNome;
        this.login = novoLogin;
        this.senha = novaSenha;
        this.email = novoEmail;
        System.out.println("Usuário editado com sucesso!");
    }    
    public int getCodUsu() {
        return codUsu;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

}
