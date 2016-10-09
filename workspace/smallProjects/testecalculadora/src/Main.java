/**
 * Created by codecadet on 29/09/16.
 */
public class Main {

        public static void main(String[] args){

            Calculadora calc1 = new Calculadora();

            Calculadora calc2;
            calc2 = new Calculadora();

            calc1.cor = "Preto";
            calc1.marca = "Texas";
            calc2.cor = "Roxo";
            calc2.marca = "Casio";
            calc1.name = "Calculadora da Sofia";
            calc2.name = "Calculadora do Eurico";

            System.out.println("A calculadora 1 é da marca " + calc1.marca + " e é da cor " + calc1.cor);

            System.out.println("A calculadora 2 é da marca " + calc2.marca + " e é da cor " + calc2.cor);


            calc1.somar(745, 647);
            calc1.dividir(1, 2);
            calc1.somar(745, 647);
            calc1.dividir(745, 647);
            calc1.somar(745, 647);
            calc1.dividir(1, 3);
            calc1.somar(745, 647);
            calc1.dividir(745, 647);


            calc1.daMeTodasAsTuasPropriedades();
            calc2.daMeTodasAsTuasPropriedades();


            System.out.println("Nível de bateria é " + calc1.bateria);


        }
}
