/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortez.ex2;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Vinicius Eustaquio Cortez
 */
public class Aluno {
    private String nome;
    private String email;
    private String id;
    private List<Matricula> matricula = new ArrayList(); 
    public Aluno(){}
    public Aluno(String id){
        this.id = id;
    }
    public List<Matricula> getMatricula() {
        return matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
