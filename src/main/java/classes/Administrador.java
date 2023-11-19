/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author vieir
 */
public class Administrador extends Usuario {
    
    public Administrador(String nome, String login, String senha, String email) {
        super(nome, login, senha, email);
    }
 // Métodos
    public void exibirUsuario() {
        System.out.println("Nome: " + nome);
        System.out.println("Login: " + login);
        System.out.println("Senha: " + senha);
        System.out.println("Email: " + email);
    }

    public void cadastrarUsuario() {
        // Lógica para cadastrar o usuário (pode ser implementada posteriormente)
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void excluirUsuario() {
        // Lógica para excluir o usuário (pode ser implementada posteriormente)
        System.out.println("Usuário excluído com sucesso!");
    }

    public void editarUsuario(String novoNome, String novoLogin, String novaSenha, String novoEmail) {
        // Lógica para editar o usuário (pode ser implementada posteriormente)
        this.nome = novoNome;
        this.login = novoLogin;
        this.senha = novaSenha;
        this.email = novoEmail;
        System.out.println("Usuário editado com sucesso!");
    }    
}
