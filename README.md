# Vendas-Java
Sistema básico de vendas e parcelamento em Java com POO.
---Codigo do botão---
     c.setValor(Double.valueOf(jTValor.getText()));
        c.setparcela(Integer.valueOf(jTparcelas.getText()));
        c.Maior();
        jLresultado.setText("Valor da venda: "+c.venda());
        jLMaiorVenda.setText(" "+c.Maior());
        jLSoma.setText(" " +c.Soma( )); 
        jTValor.setText("");
        jTValor.requestFocus();

------Codigo do Class-------
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


