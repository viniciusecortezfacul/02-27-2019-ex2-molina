/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortez.ex2;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author IFSP
 */
public class Matricula {
    private Aluno aluno;
    private Disciplina disciplina;
    private Date data = Calendar.getInstance().getTime();

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Date getData() {
        return data;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
}
