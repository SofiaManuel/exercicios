package org.academiadecodigo.calc;

/**
 * Created by codecadet on 29/09/16.
 */
public class Calculadora {


    /////////PROPRIEDADES ////////////////////
    public String cor;
    public String marca;
    public String name;
    public int bateria = 100;

    ////////////METODOS//////////////////////


    // é void porque nao devolve nada
    public void somar(int n1, int n2) {

        int soma;
        if (bateriaYes()) {
            soma = n1 + n2;
            System.out.println("O resultado da soma é " + soma);

        }
    }

    public void subtrair(int n1, int n2) {

        int subtrair;
        if (bateriaYes()) {
            subtrair = n1 - n2;
            System.out.println("O resultado da subtração é " + subtrair);
        }
    }


    public void multiplicar(int n1, int n2) {

        int multiplicação;
        if (bateriaYes()) {
            multiplicação = n1 * n2;
            System.out.println("O resultado da multiplicação é " + multiplicação);

        }
    }

    public void daMeTodasAsTuasPropriedades() {

        System.out.println(this.bateria + " " + this.marca + " " + this.cor);
    }

    public void dividir(int n1, int n2) {

        float dividir;


        if (n1 == 0 || n2 == 0) {
            System.out.println("Please insert a number bigger than 0");

        } else {
            if (bateriaYes()) {
                // aqui vou colocar os numeros inteiros a float para o resultado ser decimal;
                dividir = (float) n1 / (float) n2;
                System.out.println("O resultado da divisão é " + dividir);


            }
        }
    }

    public void setCor(String cor){
        if(cor.equals("vermelho")){
            cor = "verde";
        }
        this.cor = cor;
    }


    /////////////////////////////////////FUNCOES
    //esta funçao é chamada em cada umas das operações para verificaçao do nivel da bateria... se > 0 continuar... se < 0 quebra!;
    public boolean bateriaYes() {
        if (bateria > 0) {
            bateria -= 20;
            return true;
        }
        System.out.println("NO BATTERY!!! CHARGE ME NOOOOOOOOWWWWWWW MOTHERFUCKEEEEERRR !");
        return false;

    }
}
