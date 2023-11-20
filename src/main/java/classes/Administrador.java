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

}
