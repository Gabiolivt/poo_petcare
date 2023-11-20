/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;


import java.util.List;
import java.util.Map;
/**
 *
 * @author vieir
 */
public class Responsavel {
    private int codResp;
    private String nome;
    private String cpf;   
    private String cep;
    private String numero;   
    private String complemento;
    private String bairro;   
    private Map<String,String> contato;
    private String telefone;
    private List<Pet> Pets;

    public void adicionarPetAoResponsal(Pet pet){
    this.Pets.add(pet);
    }
    public void removerPetAoResponsal(int indice){
    this.Pets.remove(indice);
    }
    public Boolean cadastrarResponsavel(){
        return true;
    }
    public Boolean excluirResponsavel(){
        return true;
    }
    public void alterarDadosResponsavel(Responsavel resp){
        this.nome = resp.nome;
        this.cpf = resp.cpf;
        this.cep = resp.cep;
        this.bairro = resp.bairro;
        this.complemento = resp.complemento;
        this.contato = resp.contato;
        this.telefone = resp.telefone;
        this.numero = resp.numero;
        
    }

    public int getCodResp() {
        return codResp;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Map<String, String> getContato() {
        return contato;
    }

    public void setContato(Map<String, String> contato) {
        this.contato = contato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Pet> getPets() {
        return Pets;
    }

    public void setPets(List<Pet> Pets) {
        this.Pets = Pets;
    }
    
}
