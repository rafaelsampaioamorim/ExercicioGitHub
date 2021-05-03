
package exerciciogithun;

import java.util.Scanner;

public class ExercicioGitHun {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int retornoMenu; 
        
        do{
            System.out.print("Favor Informar abaixo o que deseja Fazer:\n[1]-Calcular area de uma circunferência\n[2]-Calcular Perímetro de uma circunferência\n[3]-Calcular Area do Retangulo\n[4]-Sair\nOpção:");
            
            retornoMenu = teclado.nextInt();    

            switch (retornoMenu){
                case 1,2:
                    {

                    Circuferencia bola1 = new Circuferencia();
                        do{
                            System.out.print("\n\nFavor informar o valor do Raio da Bola: ");
                            bola1.setRaio(teclado.nextFloat());    
                        }while(bola1.getRaio()==0);
                        
                        if(retornoMenu==1){
                            System.out.println("A area do circulo é: " + bola1.retornarArea());}
                        else{System.out.println("O perimetro é do circulo é: " + bola1.retornarPrimetro());}
                    }
                    break;
                case 3:{
                        Retangulo obj1 = new Retangulo();
                        do{
                            System.out.print("\n\nFavor informar os valores da base e altura do  Retangulo: ");
                            obj1.setBase(teclado.nextFloat());
                            obj1.setAltura(teclado.nextFloat());
                            
                        }while(obj1.base==0);
                        
                        obj1.calculaAreaRetangulo();
                        obj1.calculaPerimetroRetangulo();
                        obj1.imprimir();
                    }
                       
                    break;
                case 4:
                    break;// saída
                default:
                    throw new IllegalArgumentException("Opção inválida!!!");
            }
        }while(retornoMenu!=4);
    } 
}
