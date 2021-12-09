/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camilo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] letras = new String[]{"1", "3"};
        String ll = "";
        for(String l: letras){
            ll += l + ", ";
        }
        System.out.println(ll.substring(0, ll.length()-2));
    }
    
}
