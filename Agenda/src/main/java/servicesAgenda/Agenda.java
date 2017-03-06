/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicesAgenda;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author augusto.palencar1
 */
public class Agenda {

 
    
    private int id;
    public String nome;
    public String dataNasc;
    public String telefone;
    public String email;
    public String sexo;
    private Timestamp dataCad;
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNasc
     */
    public String getDataNasc() {
        return dataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
 
       /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    public int getId(String select_maxCod_Cliente1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the dataCad
     */
    public Timestamp getDataCad() {
        return dataCad;
    }

    /**
     * @param dataCad the dataCad to set
     */
//    public void setDataCad(Date dataCad) {
//        this.setDataCad(dataCad);
//    }

    /**
     * @param dataCad the dataCad to set
     */
    public void setDataCad(Timestamp dataCad) {
        this.dataCad = dataCad;
    }
    
}


