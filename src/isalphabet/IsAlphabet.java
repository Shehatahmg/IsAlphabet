/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isalphabet;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MIDO
 */
public class IsAlphabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            System.out.print("Please enter a word!");
            InputStreamReader r=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(r);
            String s1 =br.readLine();
            System.out.println(isAlpha(s1));
        } catch (IOException ex) {
            Logger.getLogger(IsAlphabet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static boolean isAlpha(String s){
        if(s.isEmpty()){
            return false;
        }
        else if(s.equals("")){
            return false;
        }{
            return (s.chars().allMatch(ch -> Character.isLetter(ch)));
        }
    }
}
