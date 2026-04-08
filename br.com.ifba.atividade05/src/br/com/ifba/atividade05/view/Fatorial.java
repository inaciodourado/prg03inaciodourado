/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade05.view;

/**
 *
 * @author inaci
 */
public class Fatorial {
    private int valor;
    private int fatorial;
    private String formula;

    //Recebe o valor e chama a função de calcular
    public void setValor(int n) {
        this.valor = n;
        calcular();
    }

    //Faz o calculo
    private void calcular() {
        fatorial = 1;
        formula = "";

        for (int i = valor; i >= 1; i--) {
            fatorial *= i;
            if (i == valor) {
                formula += i;
            } else {
                formula += " x " + i;
            }
        }
    }
    
    //Retorna o resultado
    public int getFatorial() {
        return fatorial;
    }

    //Retorna a conta 
    public String getFormula() {
        return formula;
    }
}
