/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mari (48) 99618-5728
 */
public class Aula5MathNumerosRandomicosDominio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limiteInferior = 5;
        int limiteSuperior = 10;
        int alcance = limiteSuperior - limiteInferior;
        double nrRandomico = Math.random();
        System.out.println("O número randômico escolhido entre 5 e 10 foi "
                + Math.round(limiteInferior + nrRandomico * alcance));
        
        /* ou
        int n=(int)(5+n*(10-5));
        System.out.println ("O númerorandômico escolhido entre 5 e 10 foi "+n);
        */
        
    }
    
}
