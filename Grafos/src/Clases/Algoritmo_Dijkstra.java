/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;


import static Ventanas.VentanaPrincipal.jPanel1;
import static Ventanas.VentanaPrincipal.R_repaint;
import static Ventanas.VentanaPrincipal.ingresarNodoOrigen;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author fredy-18
 */
public class Algoritmo_Dijkstra {
   private  Arboles arboles;
   private int subTope;
   private Nodo auxi=null;
   private double auxAumulado; // es un acumulado auxiliar
   private double subAcomulado;
   private Nodo nodo[]; 
   private int tope;
   private int permanente;     
   private int nodoFin; 
   
   
    public Algoritmo_Dijkstra (Arboles arboles, int tope,int permanente, int nodoFin){
        this.arboles = arboles;        
        this.tope = tope;
        this.nodo= new Nodo[tope]; 
        this.permanente = permanente;
        this.nodoFin = nodoFin;
        
    }

    public double getAcumulado(){
        return nodo[nodoFin].getAcumulado(); 
    }
        
    public void dijkstra(){ 
         for (int i = 0; i < tope; i++)  // creamos el vector nodo del tamaño de tope el cual tiene el numero de nodo pintados 
                    nodo[i]= new Nodo(); 
         
        if(permanente != nodoFin){
             jPanel1.paint(jPanel1.getGraphics());
             R_repaint(tope, arboles);   
             Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(permanente), arboles.getCordeY(permanente), null,Color.GREEN); // pinta de color GREEN los nodos
            
        
            nodo[permanente].setVisitado(true);        
            nodo[permanente].setNombre(permanente);       
            
            do{            
              subAcomulado=0;
              auxAumulado = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, supuestamente  nunca sera mayor 
              nodo[permanente].setEtiqueta(true); 
              for (int j = 0; j < tope; j++) {
                  if(arboles.getmAdyacencia(j, permanente)==1){
                        subAcomulado= nodo[permanente].getAcumulado()+arboles.getmCoeficiente(j, permanente);                                 
                        if(subAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado()==true && nodo[j].isEtiqueta()== false){
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[permanente]);
                        }
                        else if( nodo[j].isVisitado()==false){
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[permanente]); 
                       }
                 }
              }
              for (int i = 0; i <tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como permanente 
                if(nodo[i].isVisitado()== true && nodo[i].isEtiqueta()== false){
                   if(nodo[i].getAcumulado()<=auxAumulado){
                       permanente= nodo[i].getNombre();
                       auxAumulado= nodo[i].getAcumulado();
                   }
                }               
             }
            subTope++;                
          }while(subTope<tope+1);          
          auxi= nodo[nodoFin]; 
           if(auxi.getPredecesor() == null )
             JOptionPane.showMessageDialog(null,"No se Pudo LLegar Al Nodo "+nodoFin);          
          while(auxi.getPredecesor() != null){           
              Pintar.pintarCamino(jPanel1.getGraphics(), arboles.getCordeX(auxi.getNombre()), arboles.getCordeY(auxi.getNombre()), arboles.getCordeX(auxi.getPredecesor().getNombre()), arboles.getCordeY(auxi.getPredecesor().getNombre()),Color.RED);
              Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(auxi.getNombre()), arboles.getCordeY(auxi.getNombre()), null,Color.MAGENTA);
             auxi=auxi.getPredecesor();              
          }  
         Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null,Color.RED);     
       }
       else Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null,Color.RED);    
    }
    
    
 
}
