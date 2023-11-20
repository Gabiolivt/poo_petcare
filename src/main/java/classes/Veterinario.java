/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author vieir
 */
public class Veterinario extends Usuario {
    private String CRMV;
    private String especialidade;

    public Veterinario(String nome, String login, String senha, String email, String CRMV, String especialidade ) {
        super(nome, login, senha, email);
        this.CRMV = CRMV;
        this.especialidade = especialidade;
        
    }
     public String getCRMV() {
        return CRMV;
    }

    public void setCRMV(String CRMV) {
        this.CRMV = CRMV;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
