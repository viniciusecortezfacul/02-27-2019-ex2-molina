/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortez.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicius Eustaquio Cortez
 */
public class Disciplina {
    private String nome;
    private String id;
    private List<Matricula> matriculas = new ArrayList();
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public List<Matricula> getMatricula(){
        return this.matriculas;
    }
}
