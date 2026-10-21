/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vendas;

/**
 *
 * @author nicole57193517
 */
public class Vendas {
     
    private double Valor;
    private int parcela;
    double total;
    public double Maior;
    public double Soma;
    public double getValor() {
        return Valor;
    }
    public void setValor(double Valor){
        this.Valor = Valor; 
     }
    public void getparcela(int parcela ){
        this.parcela = parcela;
    }
    public void setparcela(int parcela ){
        this.parcela = parcela;
    }
    public void getMaior(double Maior){
        this.Maior = Maior;
    }
    public void setMaior(double Maior){
        this.Maior = Maior;
    }
    public double Maior( ){
       if(Valor>Maior){
           Maior=Valor;
       }
       return Maior;
    }
    public double Soma( ){
        this.Soma=Soma+Valor;{
    }
    return Soma;
    }
    public double venda( ){
        if (this.parcela <=1){
        return this.Valor-(this.Valor*0.1); 
        }
        else if (this.parcela >1 && this.parcela<=3){
            total=this.Valor+this.Valor*0.05;
        }
        else if(this.parcela >3){
            total=this.Valor+this.Valor*0.1;
        }
        return total;
    }
}