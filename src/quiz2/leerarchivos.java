/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author lucho
 */
public class leerarchivos {
  
    
     public static String muestraContenido(String archivo) throws FileNotFoundException, IOException {
        
        String cadena="";
     
        
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        if((b.readLine())!=null) {
            cadena = b.readLine();
        }else{
            cadena = "No existe la dirección";
        }
        return cadena;
    }

    public static void main(String[] args) throws IOException {
   String URL="";
   String urlene="e";
   String urlobs="";
   String urlobj="";
   String urlhero="";
   
        urlene = muestraContenido("urlenemigo");
        //muestraContenido("urlhero",urlhero);
        //muestraContenido("urlobjeto",urlobj);
        //muestraContenido("urlobstaculo",urlobs);
        System.out.println(urlene);
    }
   
}
    
    
    



