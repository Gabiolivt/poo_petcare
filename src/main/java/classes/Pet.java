/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.List;

/**
 *
 * @author vieir
 */
public class Pet {
     private int codPet;
     private String nome;
     private String raca;
     private List<Responsavel> responsaveis;
     
     
     public Pet buscarPet(int idPet){
     
         return new Pet();
     }
     public void editarPet(Pet pet){
         this.nome = pet.nome;
         this.raca = pet.raca;
     }
     public Boolean excluirPet(){
         return true;
     }
     public Boolean cadastrarPet(){
         return true;
     }

    public int getCodPet() {
        return codPet;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public List<Responsavel> getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(List<Responsavel> responsaveis) {
        this.responsaveis = responsaveis;
    }
     
}
