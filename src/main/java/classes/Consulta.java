/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.Time;
import java.util.Date;
/**
 *
 * @author vieir
 */
public class Consulta {

    private int codCon;
    private Date data;
    private Time horario;
    private String sala;
    private String obs_responsavel;
    private String descricao;
    private String tipo_consulta;
    private Veterinario veterinario;
    private Recepcionista recepcionista;

    
        
    
    public Boolean agendarConsulta() {
        if(this.checarDadosObrigatorios()){
            //GRAVAR CONSULTA NO BANCO
            System.out.println("Consulta agendada com sucesso!");
            return true;
        }
        
        return false;
        
           }
    private Boolean checarDadosObrigatorios(){
        Boolean passou = true; 
        if(!this.temRecepcionista()){
            System.out.println("Recepcionista é campo obrigatorio!");
            passou = false;
        }
        if(!this.temVeterinario()){
            System.out.println("Veterinario é campo obrigatorio!");
            passou = false; 
        }
        if(this.data == null){
            System.out.println("Data é campo obrigatorio!");
            passou = false;    
        }
        if(this.horario == null){
            System.out.println("Hora é campo obrigatorio!");
            passou = false;
        }
        return passou;
    }
    public void desmarcarConsulta() {
       

    }
    private Boolean temVeterinario(){
        return this.veterinario.getCRMV() != null;
    }
    private Boolean checarVeterinario(Veterinario veterinario){
        
        if(this.temVeterinario()){
            if(veterinario.getCRMV() == null){
              System.out.println("Veterinário não informado!");
              return false;
            }else{
                return this.veterinario.getCRMV().equals(veterinario.getCRMV());
            }    
        }else{
            System.out.println("Consulta precisa ter Veterinário associado!");
            return false;
        }
    }
    private Boolean temRecepcionista(){
        return this.recepcionista.getNome() != null;
    }
   public Consulta buscarConsulta(int codCon){
        return new Consulta();
   }
    public void exibirConsultaPelaHora(Date data_consulta, Time hora) {
        Consulta consultaRetornada =  new Consulta();//BUSCAR CONSULTA PELA HORA
        this.data = consultaRetornada.getData();
        this.descricao = consultaRetornada.getDescricao();
        this.horario = consultaRetornada.getHorario();
        this.obs_responsavel = consultaRetornada.getObs_responsavel();
        this.recepcionista = consultaRetornada.getRecepcionista();
        this.sala = consultaRetornada.getSala();
        this.tipo_consulta = consultaRetornada.getTipo_consulta();
        this.veterinario = consultaRetornada.getVeterinario();
      
    }
    public void finalizarConsulta(Veterinario veterinario) {
        
        if(this.checarVeterinario(veterinario)){
        //GRAVAR ALTERAÇÕES CONSULTA NO BANCO
        }else{
        System.out.println("Veterinario deve ser o mesmo associado!");
        }
        
    }

    public int getCodCon() {
        return codCon;
    }
    
    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getObs_responsavel() {
        return obs_responsavel;
    }

    public void setObs_responsavel(String obs_responsavel) {
        this.obs_responsavel = obs_responsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }
}
