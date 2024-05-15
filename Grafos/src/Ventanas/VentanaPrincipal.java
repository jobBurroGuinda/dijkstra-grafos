/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import Clases.Arboles;
import Clases.Pintar;
import Clases.Algoritmo_Dijkstra;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class VentanaPrincipal extends javax.swing.JFrame {
       
    /**
     * Creates new form VentanaPincipal
     */
   Pintar pintar =new Pintar();
   Arboles arboles = new Arboles();    
   public static void R_repaint(int tope, Arboles arboles){//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if(arboles.getmAdyacencia(j, k) == 1)
                     Pintar.pintarLinea(jPanel1.getGraphics(),arboles.getCordeX(j),arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k),arboles.getmCoeficiente(j, k));
            }
        }
        for (int j = 0; j < tope; j++) 
            Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(j),arboles.getCordeY(j),String.valueOf(arboles.getNombre(j)));
                
   }
 
public static int ingresarNodoOrigen(String nodoOrige, String noExiste,int tope){
    int nodoOrigen = 0;
        try{
            nodoOrigen = Integer.parseInt(JOptionPane.showInputDialog(""+nodoOrige));   
            if(nodoOrigen>=tope){  
                  JOptionPane.showMessageDialog(null,""+noExiste+"\nDebe de ingresar  un nodo existente");
                  nodoOrigen = ingresarNodoOrigen(nodoOrige,noExiste, tope);
            }
        }catch(Exception ex){
            nodoOrigen = ingresarNodoOrigen(nodoOrige,noExiste,tope);
        }
        return nodoOrigen;
}          
 public  double ingresarTamano(String tama){        
        double tamano = 0;
        try{
            tamano = Double.parseDouble(JOptionPane.showInputDialog(""+tama));
            if(tamano<1){ JOptionPane.showMessageDialog(null,"Debe Ingresar un Tamaño Aceptado..");
               tamano = ingresarTamano(tama);//no es nesario hacer esto
            }
        }catch(Exception ex){
            tamano = ingresarTamano(tama);
        }
        return tamano;
    }
 public boolean cicDerechoSobreNodo(int xxx,int yyy){ 
     for (int j = 0; j < tope; j++) {// consultamos si se ha sado  click sobre algun nodo 
            if((xxx+2) > arboles.getCordeX(j) && xxx < (arboles.getCordeX(j)+13) && (yyy+2) > arboles.getCordeY(j) && yyy<(arboles.getCordeY(j)+13) ) {
                                       
               if(n==0){
                   id = j;
                   R_repaint(tope,arboles);
                   Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null,Color.orange);       
                   n++;                   
               }
               else{ 
                   id2=j;                   
                   n++;
                   Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null,Color.orange);       
                   if(id==id2){// si id == id2 por q se volvio a dar click sobre el mismos nodo, se cancela el click anterio
                       n=0;
                       Pintar.pintarCirculo(jPanel1.getGraphics(),arboles.getCordeX(id), arboles.getCordeY(id),String.valueOf(arboles.getNombre(id)));
                       id=-1;
                       id2=-1;
                   }
               } 
               nn=0;
                return true;              
            }
         }
     return false;
 }  
 
 public void clicIzqSobreNodo(int xxx, int yyy){
            for (int j = 0; j <tope; j++) {
              if((xxx+2) > arboles.getCordeX(j) && xxx < (arboles.getCordeX(j)+13) && (yyy+2) > arboles.getCordeY(j) && yyy<(arboles.getCordeY(j)+13) ) {
                if(nn==0){
                   permanente =j; 
                   R_repaint(tope, arboles);                   
               }
               else{ nodoFin = j;}
                nn++;
                n=0;
                id =-1;
                Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null,Color.GREEN);  
                   break;
               }
           
            }
            
     
 }
 
 public void adactarImagen(File file){
  try{   
 
        BufferedImage read = ImageIO.read(file);
        Image scaledInstance = read.getScaledInstance(jmapa.getWidth(),jmapa.getHeight(), Image.SCALE_DEFAULT);
      
 jmapa.setIcon(new ImageIcon(scaledInstance));  
 }catch(Exception ex){
               JOptionPane.showMessageDialog(null,"Error al cargar la imagen");
       }
 }
         

    public VentanaPrincipal() { 
        initComponents();
        jPanel2.setVisible(false);   
        jDialog1.setLocationRelativeTo(null);
        
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jmapa = new javax.swing.JLabel();
        botonRepain = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botonAzul = new javax.swing.JButton();
        botonRosa = new javax.swing.JButton();
        botonGris = new javax.swing.JButton();
        botonPurpura = new javax.swing.JButton();
        botonGris2 = new javax.swing.JButton();
        botonAzulito = new javax.swing.JButton();
        botonGris3 = new javax.swing.JButton();
        botonAzul2 = new javax.swing.JButton();
        botonRojo = new javax.swing.JButton();
        botonVerde2 = new javax.swing.JButton();
        botonBlanco = new javax.swing.JButton();
        botonVerde1 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtacumulado = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opcionDijkstra = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        opcioNvaArista = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        opcionMatrizPesos = new javax.swing.JMenuItem();
        opcionMatrizAdyacencia = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        opcionGrafoDefault = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        jDialog1.setMinimumSize(new java.awt.Dimension(700, 450));
        jDialog1.setResizable(false);
        jDialog1.getContentPane().setLayout(null);

        jFileChooser2.setMaximumSize(new java.awt.Dimension(21475, 21474));
        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jFileChooser2);
        jFileChooser2.setBounds(10, 20, 670, 390);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UPIIZ - IPN - 3CM3 / Karla Guadalupe Rocha Quezada - Ramón Emmanuel García Murillo - Job Adolfo Salinas Hernández");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));
        jPanel1.setMinimumSize(new java.awt.Dimension(770, 522));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });
        jPanel1.setLayout(null);

        jmapa.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jmapa);
        jmapa.setBounds(10, 10, 750, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(210, 10, 770, 520);

        botonRepain.setText("Borrar camino");
        botonRepain.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        botonRepain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRepainActionPerformed(evt);
            }
        });
        getContentPane().add(botonRepain);
        botonRepain.setBounds(40, 410, 110, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        botonAzul.setBackground(new java.awt.Color(0, 153, 153));
        botonAzul.setForeground(new java.awt.Color(153, 153, 0));
        botonAzul.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        botonAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAzulMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonAzulMouseReleased(evt);
            }
        });
        botonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAzulActionPerformed(evt);
            }
        });
        jPanel2.add(botonAzul);
        botonAzul.setBounds(10, 10, 20, 20);

        botonRosa.setBackground(new java.awt.Color(204, 0, 204));
        botonRosa.setForeground(new java.awt.Color(153, 153, 0));
        botonRosa.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        botonRosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonRosaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonRosaMouseReleased(evt);
            }
        });
        botonRosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRosaActionPerformed(evt);
            }
        });
        jPanel2.add(botonRosa);
        botonRosa.setBounds(40, 10, 20, 20);

        botonGris.setBackground(new java.awt.Color(189, 182, 182));
        botonGris.setForeground(new java.awt.Color(153, 153, 0));
        botonGris.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        botonGris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGrisMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGrisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonGrisMouseReleased(evt);
            }
        });
        botonGris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGrisActionPerformed(evt);
            }
        });
        jPanel2.add(botonGris);
        botonGris.setBounds(100, 10, 20, 20);

        botonPurpura.setBackground(new java.awt.Color(51, 0, 51));
        botonPurpura.setForeground(new java.awt.Color(153, 153, 0));
        botonPurpura.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        botonPurpura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPurpuraMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonPurpuraMouseReleased(evt);
            }
        });
        botonPurpura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPurpuraActionPerformed(evt);
            }
        });
        jPanel2.add(botonPurpura);
        botonPurpura.setBounds(10, 40, 20, 20);

        botonGris2.setBackground(java.awt.Color.lightGray);
        botonGris2.setForeground(new java.awt.Color(153, 153, 0));
        botonGris2.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        botonGris2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGris2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonGris2MouseReleased(evt);
            }
        });
        botonGris2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGris2ActionPerformed(evt);
            }
        });
        jPanel2.add(botonGris2);
        botonGris2.setBounds(40, 40, 20, 20);

        botonAzulito.setBackground(new java.awt.Color(164, 167, 255));
        botonAzulito.setForeground(new java.awt.Color(153, 153, 0));
        botonAzulito.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        botonAzulito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAzulitoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonAzulitoMouseReleased(evt);
            }
        });
        botonAzulito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAzulitoActionPerformed(evt);
            }
        });
        jPanel2.add(botonAzulito);
        botonAzulito.setBounds(70, 70, 20, 20);

        botonGris3.setBackground(new java.awt.Color(141, 141, 141));
        botonGris3.setForeground(new java.awt.Color(153, 153, 0));
        botonGris3.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        botonGris3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGris3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonGris3MouseReleased(evt);
            }
        });
        botonGris3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGris3ActionPerformed(evt);
            }
        });
        jPanel2.add(botonGris3);
        botonGris3.setBounds(100, 40, 20, 20);

        botonAzul2.setBackground(new java.awt.Color(0, 0, 255));
        botonAzul2.setForeground(new java.awt.Color(153, 153, 0));
        botonAzul2.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        botonAzul2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAzul2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonAzul2MouseReleased(evt);
            }
        });
        jPanel2.add(botonAzul2);
        botonAzul2.setBounds(100, 70, 20, 20);

        botonRojo.setBackground(new java.awt.Color(153, 0, 0));
        botonRojo.setForeground(new java.awt.Color(153, 153, 0));
        botonRojo.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        botonRojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonRojoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonRojoMouseReleased(evt);
            }
        });
        botonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRojoActionPerformed(evt);
            }
        });
        jPanel2.add(botonRojo);
        botonRojo.setBounds(70, 10, 20, 20);

        botonVerde2.setBackground(new java.awt.Color(0, 102, 102));
        botonVerde2.setForeground(new java.awt.Color(153, 153, 0));
        botonVerde2.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        botonVerde2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVerde2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonVerde2MouseReleased(evt);
            }
        });
        jPanel2.add(botonVerde2);
        botonVerde2.setBounds(40, 70, 20, 20);

        botonBlanco.setBackground(java.awt.Color.white);
        botonBlanco.setForeground(new java.awt.Color(153, 153, 0));
        botonBlanco.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        botonBlanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBlancoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonBlancoMouseReleased(evt);
            }
        });
        jPanel2.add(botonBlanco);
        botonBlanco.setBounds(70, 40, 20, 20);

        botonVerde1.setBackground(new java.awt.Color(0, 51, 51));
        botonVerde1.setForeground(new java.awt.Color(153, 153, 0));
        botonVerde1.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        botonVerde1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVerde1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonVerde1MouseReleased(evt);
            }
        });
        jPanel2.add(botonVerde1);
        botonVerde1.setBounds(10, 70, 20, 20);

        jButton14.setText("OK");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);
        jButton14.setBounds(30, 100, 60, 32);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 40, 130, 130);

        jLabel1.setFont(new java.awt.Font("AngsanaUPC", 2, 18)); // NOI18N
        jLabel1.setText("UPIIZ - IPN - 3CM3 / Matemáicas Discretas - Prof. Yésika Yuriri");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 530, 630, 20);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Acumulado"));
        jPanel3.setLayout(null);

        jtacumulado.setEnabled(false);
        jtacumulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtacumuladoActionPerformed(evt);
            }
        });
        jPanel3.add(jtacumulado);
        jtacumulado.setBounds(10, 20, 110, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(30, 470, 130, 60);

        jMenu1.setText("Más");
        jMenu1.add(jSeparator1);

        opcionDijkstra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        opcionDijkstra.setText("Camino más corto");
        opcionDijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionDijkstraActionPerformed(evt);
            }
        });
        jMenu1.add(opcionDijkstra);
        jMenu1.add(jSeparator3);

        opcioNvaArista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        opcioNvaArista.setText("Nueva arista");
        opcioNvaArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcioNvaAristaActionPerformed(evt);
            }
        });
        jMenu1.add(opcioNvaArista);
        jMenu1.add(jSeparator2);

        opcionMatrizPesos.setText("Matríz de pesos/coeficientes");
        opcionMatrizPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMatrizPesosActionPerformed(evt);
            }
        });
        jMenu1.add(opcionMatrizPesos);

        opcionMatrizAdyacencia.setText("Matríz de adyacencia");
        opcionMatrizAdyacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMatrizAdyacenciaActionPerformed(evt);
            }
        });
        jMenu1.add(opcionMatrizAdyacencia);
        jMenu1.add(jSeparator4);

        opcionGrafoDefault.setText("Pintar grafo por default");
        opcionGrafoDefault.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                opcionGrafoDefaultMousePressed(evt);
            }
        });
        opcionGrafoDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionGrafoDefaultActionPerformed(evt);
            }
        });
        jMenu1.add(opcionGrafoDefault);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Cargar imagen");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Limpiar o borrar grafo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator5);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Salir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Eliminar");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem10.setText("Eliminar nodo");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Eliminar arista");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Eliminar todas las aristas ");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Editar área de grafos");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem12.setText("Elegir color");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1012, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       int xxx, yyy;   
       xxx=evt.getX();
       yyy=evt.getY();
       if(evt.isMetaDown()){
           clicIzqSobreNodo(xxx, yyy );            
          if(nn==2){
              nn=0;
               Algoritmo_Dijkstra Dijkstra = new Algoritmo_Dijkstra(arboles,tope,permanente, nodoFin);
               Dijkstra.dijkstra();
               jtacumulado.setText(""+Dijkstra.getAcumulado());
               
           }
       }
       else{
       if(!cicDerechoSobreNodo(xxx,yyy)){// si  clik sobre  nodo es falso entra
          if(tope<50){
               arboles.setCordeX(tope,xxx);
               arboles.setCordeY(tope,yyy);
               arboles.setNombre(tope, tope);
             Pintar.pintarCirculo(jPanel1.getGraphics(),arboles.getCordeX(tope), arboles.getCordeY(tope),String.valueOf(arboles.getNombre(tope)));
           tope++;          
          } 
         else JOptionPane.showMessageDialog(null,"Se ha llegado al Maximo de nodos..");
       } 
         if(n==2 ){
             n=0; 
             double ta = ingresarTamano("Ingrese Tamaño");
             if(aristaMayor < ta) aristaMayor=ta;
             arboles.setmAdyacencia(id2, id, 1);
             arboles.setmAdyacencia(id, id2, 1);
             arboles.setmCoeficiente(id2, id,ta );
             arboles.setmCoeficiente(id, id2, ta);
             Pintar.pintarLinea(jPanel1.getGraphics(),arboles.getCordeX(id), arboles.getCordeY(id), arboles.getCordeX(id2), arboles.getCordeY(id2), ta); 
             Pintar.pintarCirculo(jPanel1.getGraphics(),arboles.getCordeX(id), arboles.getCordeY(id),String.valueOf(arboles.getNombre(id)));
             Pintar.pintarCirculo(jPanel1.getGraphics(),arboles.getCordeX(id2), arboles.getCordeY(id2),String.valueOf(arboles.getNombre(id2)));
              id=-1;
              id2=-1;
         }
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void opcionGrafoDefaultMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionGrafoDefaultMousePressed

    }//GEN-LAST:event_opcionGrafoDefaultMousePressed

    private void opcionGrafoDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionGrafoDefaultActionPerformed
        //jMenuItem2.setEnabled(false);
        jPanel1.paint(jPanel1.getGraphics()); 
         n=0;
         id=-1;
         id2=-1;
            int Matriz[][]={{0,1,0,1,1,0,0,1},
                            {1,0,1,0,0,0,0,0},
                            {0,1,0,1,1,0,0,0},
                            {1,0,1,0,0,0,0,0},
                            {1,0,1,0,0,1,0,0},
                            {0,0,0,0,1,0,1,1},
                            {0,0,0,0,0,1,0,0},
                            {1,0,0,0,0,1,0,0}
                           };
          double coe[][]={{0,50,0,46,216,0,0,578}, 
               {50,0,59,0,0,0,0,0}, 
               {0,59,0,89,174,0,0,0},
               {46,0,89,0,0,0,0,0},
               {216,0,174,0,0,471,0,0} ,
               {0,0,0,0,471,0,194,398},  
               {0,0,0,0,0,194,0,0}, 
               {578,0,0,0,0,398,0,0},
  
  };
   int xx1[]={202,102,8,198,248,352,481,416};
  int yy1[]={12,74,165,113,233,300,368,177};
  int nom[]={0,1,2,3,4,5,6,7};          
        aristaMayor=600;       
        for (int j = 0; j < 8; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);      
         
        }
        for (int j = 0; j < 8; j++) {            
            for (int k = 0; k < 8; k++) {
                arboles.setmAdyacencia(j,k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, coe[j][k]); 
            }
        }        
       tope=8;       
        R_repaint(tope,arboles);
    }//GEN-LAST:event_opcionGrafoDefaultActionPerformed

    private void opcionMatrizPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMatrizPesosActionPerformed
        if(tope==0)
            JOptionPane.showMessageDialog(null,"Aun no se ha creado un nodo: ");
        
        else{
            this.setEnabled(false);
          new Matrices(tope,arboles,2,this).setVisible(true);
        }
    }//GEN-LAST:event_opcionMatrizPesosActionPerformed

    private void opcionMatrizAdyacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMatrizAdyacenciaActionPerformed
      if(tope==0)
            JOptionPane.showMessageDialog(null,"Aun no se ha credo un nodo: ");
      
      else{
          this.setEnabled(false);
        new Matrices(tope,arboles,1,this).setVisible(true);
      }
    }//GEN-LAST:event_opcionMatrizAdyacenciaActionPerformed

    private void opcioNvaAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcioNvaAristaActionPerformed
       if(tope<=1)
            JOptionPane.showMessageDialog(null,"Cree nuevo nodo: ");
       
       else{
           this.setEnabled(false);
         new VentanaArista(arboles,pintar,tope,this).setVisible(true);
           jPanel1.paint(jPanel1.getGraphics());
           R_repaint(tope,arboles);        
       }
    }//GEN-LAST:event_opcioNvaAristaActionPerformed

    private void botonRepainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRepainActionPerformed
        R_repaint(tope,arboles);  
    }//GEN-LAST:event_botonRepainActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
     // TODO add your handling code here:
      
        
         
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
     
    }//GEN-LAST:event_jPanel1KeyReleased

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      
          for (int j = 0; j < tope; j++) {
              arboles.setCordeX(j,0);
              arboles.setCordeY(j,0);              
              arboles.setNombre(j,0);            
        }
         for (int j = 0; j < tope; j++) {
             for (int k = 0; k < tope; k++) {
                 arboles.setmAdyacencia(j, k, 0);
                 arboles.setmCoeficiente(j, k, 0);                 
             }            
        }
        tope=00;   
        jPanel1.repaint(); 
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
       // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
    if(tope>=2){
        this.setEnabled(false);
      new EliminarAristas(pintar,arboles,tope,this).setVisible(true);
      jPanel1.paint(jPanel1.getGraphics());
      R_repaint(tope,arboles); 
    }
    else  JOptionPane.showMessageDialog(null,"No hay nodos enlazados ");
    
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
      int Eliminar= ingresarNodoOrigen("Ingrese Nodo a Eliminar ","Nodo No existe",tope); 
 if(Eliminar<=tope && Eliminar>=0 && tope>0){
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++){
                if(j==Eliminar ||k==Eliminar){
                    arboles.setmAdyacencia(j, k, -1);                    
                }
            }
        }
        for (int l = 0; l < tope-1; l++) {
                    for (int m = 0; m < tope; m++) {
                      if(arboles.getmAdyacencia(l, m)==-1){
                           arboles.setmAdyacencia(l, m,arboles.getmAdyacencia(l+1, m)); 
                           arboles.setmAdyacencia(l+1, m,-1);
                           arboles.setmCoeficiente(l, m,arboles.getmCoeficiente(l+1, m));
                      }
                  }
                }
                for (int l = 0; l < tope; l++) {
                    for (int m = 0; m < tope-1; m++) {
                
                     if(arboles.getmAdyacencia(l, m)==-1){
                           arboles.setmAdyacencia(l, m,arboles.getmAdyacencia(l, m+1)); 
                           arboles.setmAdyacencia(l, m+1,-1);
                           arboles.setmCoeficiente(l, m,arboles.getmCoeficiente(l, m+1));
                          
                     }
                    }
                }
                
                arboles.setCordeX(Eliminar,-10);
                arboles.setCordeY(Eliminar,-10);
                arboles.setNombre(Eliminar, -10);
                for (int j = 0; j < tope; j++) {
                    for (int k = 0; k < tope-1; k++) {
                        if(arboles.getCordeX(k)==-10){
                            arboles.setCordeX(k, arboles.getCordeX(k+1));
                            arboles.setCordeX(k+1, -10);
                            arboles.setCordeY(k, arboles.getCordeY(k+1));
                             arboles.setCordeY(k+1, -10);
                            arboles.setNombre(k, arboles.getNombre(k+1));
                            arboles.setNombre(k+1,-10);
                        }
                    }
               }
                for (int j = 0; j < tope; j++)                      
                arboles.setNombre(j,j);// renombramos             
                
                // eliminamos los -1 y  los -10 
                for (int j = 0; j < tope+1; j++) {
                    for (int k = 0; k < tope+1; k++) {
                       if( arboles.getmAdyacencia(j, k)!=-1)
                          arboles.setmAdyacencia(j, k, arboles.getmAdyacencia(j, k));
                       else 
                          arboles.setmAdyacencia(j, k, 0);                       
                       if(arboles.getmCoeficiente(j, k) !=-10)
                           arboles.setmCoeficiente(j, k, arboles.getmCoeficiente(j, k));
                       else
                           arboles.setmCoeficiente(j, k, 0);                        
                    }         
                }
                tope--;
                jPanel1.paint(jPanel1.getGraphics());
                R_repaint(tope,arboles);
       }    
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {      
                    arboles.setmAdyacencia(j, k, 0);
                    arboles.setmAdyacencia(k, j, 0);
                    arboles.setmCoeficiente(j, k, 0);
                    arboles.setmCoeficiente(k, j, 0);
            }
        }
        jPanel1.paint(jPanel1.getGraphics());
        R_repaint(tope,arboles);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void botonRosaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRosaMousePressed
       jPanel1.setBackground(botonRosa.getBackground());
       jmapa.setIcon(null);
    }//GEN-LAST:event_botonRosaMousePressed

    private void botonRosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRosaActionPerformed

    private void botonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAzulActionPerformed
      
    }//GEN-LAST:event_botonAzulActionPerformed

    private void botonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRojoActionPerformed
      
    }//GEN-LAST:event_botonRojoActionPerformed

    private void botonGrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGrisActionPerformed
   
    }//GEN-LAST:event_botonGrisActionPerformed

    private void botonPurpuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPurpuraActionPerformed
     
    }//GEN-LAST:event_botonPurpuraActionPerformed

    private void botonGris2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGris2ActionPerformed
      
    }//GEN-LAST:event_botonGris2ActionPerformed

    private void botonAzulitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAzulitoActionPerformed
      
    }//GEN-LAST:event_botonAzulitoActionPerformed
    private void botonGris3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGris3ActionPerformed
    
    }//GEN-LAST:event_botonGris3ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jPanel2.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        jPanel2.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void botonGrisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGrisMouseReleased
      R_repaint(tope,arboles);   // TODO add your handling code here:
    }//GEN-LAST:event_botonGrisMouseReleased

    private void botonGrisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGrisMouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_botonGrisMouseClicked

    private void botonGrisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGrisMousePressed
       jPanel1.setBackground(botonGris.getBackground());
       jmapa.setIcon(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGrisMousePressed

    private void botonAzulMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAzulMousePressed
       jPanel1.setBackground(botonAzul.getBackground());
       jmapa.setIcon(null);
       // TODO add your handling code here:
    }//GEN-LAST:event_botonAzulMousePressed

    private void botonAzulMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAzulMouseReleased
      R_repaint(tope,arboles);  // TODO add your handling code here:
    }//GEN-LAST:event_botonAzulMouseReleased

    private void botonRosaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRosaMouseReleased
      R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_botonRosaMouseReleased

    private void botonRojoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRojoMousePressed
      jPanel1.setBackground(botonRojo.getBackground());
       jmapa.setIcon(null);
       // TODO add your handling code here:
    }//GEN-LAST:event_botonRojoMousePressed

    private void botonRojoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRojoMouseReleased
    R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_botonRojoMouseReleased

    private void botonPurpuraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPurpuraMousePressed
     jPanel1.setBackground(botonPurpura.getBackground());
       jmapa.setIcon(null);
              // TODO add your handling code here:
    }//GEN-LAST:event_botonPurpuraMousePressed

    private void botonPurpuraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPurpuraMouseReleased
    R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_botonPurpuraMouseReleased

    private void botonAzulitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAzulitoMousePressed
       jPanel1.setBackground(botonAzulito.getBackground());
       jmapa.setIcon(null);
             // TODO add your handling code here:
    }//GEN-LAST:event_botonAzulitoMousePressed

    private void botonAzulitoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAzulitoMouseReleased
     R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_botonAzulitoMouseReleased

    private void botonGris3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGris3MousePressed
        jPanel1.setBackground(botonGris3.getBackground());
       jmapa.setIcon(null);
    }//GEN-LAST:event_botonGris3MousePressed

    private void botonGris3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGris3MouseReleased
     R_repaint(tope,arboles);  // TODO add your handling code here:
    }//GEN-LAST:event_botonGris3MouseReleased

    private void botonGris2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGris2MousePressed
      jPanel1.setBackground(botonGris2.getBackground()); 
       jmapa.setIcon(null);
    }//GEN-LAST:event_botonGris2MousePressed

    private void botonGris2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGris2MouseReleased
       R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_botonGris2MouseReleased

    private void botonVerde1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerde1MousePressed
      jPanel1.setBackground(botonVerde1.getBackground()); 
       jmapa.setIcon(null);
    }//GEN-LAST:event_botonVerde1MousePressed

    private void botonVerde2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerde2MousePressed
      jPanel1.setBackground(botonVerde2.getBackground());      
       jmapa.setIcon(null);
    }//GEN-LAST:event_botonVerde2MousePressed

    private void botonBlancoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBlancoMouseReleased
       R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_botonBlancoMouseReleased

    private void botonAzul2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAzul2MousePressed
      jPanel1.setBackground(botonAzul2.getBackground());    
       jmapa.setIcon(null);
    }//GEN-LAST:event_botonAzul2MousePressed

    private void botonBlancoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBlancoMousePressed
       jPanel1.setBackground(botonBlanco.getBackground()); // TODO add your handling code here:
       jmapa.setIcon(null);
    }//GEN-LAST:event_botonBlancoMousePressed

    private void botonVerde2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerde2MouseReleased
       R_repaint(tope,arboles);  // TODO add your handling code here:
    }//GEN-LAST:event_botonVerde2MouseReleased

    private void botonAzul2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAzul2MouseReleased
     R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_botonAzul2MouseReleased

    private void botonVerde1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerde1MouseReleased
       R_repaint(tope,arboles);        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerde1MouseReleased

    private void opcionDijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionDijkstraActionPerformed
     if(tope>=2){
          permanente =  ingresarNodoOrigen("Ingrese nodo origen..","nodo origen no existe",tope);// hacemos el llamano de la funcion         
          nodoFin =  ingresarNodoOrigen("Ingrese nodo de destino..","nodo fin no existe",tope);
            Algoritmo_Dijkstra Dijkstra = new Algoritmo_Dijkstra(arboles,tope,permanente,nodoFin);
            Dijkstra.dijkstra();
            jtacumulado.setText(""+Dijkstra.getAcumulado());
        }
    else JOptionPane.showMessageDialog(null,"Se deben de crear mas nodos ... ");
    }//GEN-LAST:event_opcionDijkstraActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jtacumuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtacumuladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtacumuladoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       jDialog1.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed
 
        JFileChooser selectorArchios = (JFileChooser) evt.getSource();
        String comando = evt.getActionCommand();
        if(comando.equals(JFileChooser.APPROVE_SELECTION)){
            File archiSeleccionado = selectorArchios.getSelectedFile();
            adactarImagen(archiSeleccionado);
            jDialog1.setVisible(false);
            //JOptionPane.showMessageDialog(null, ""+archiSeleccionado+"  Nombre:"+archiSeleccionado.getName());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser2ActionPerformed

    /**
     * @param args the command line arguments
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new VentanaPrincipal().setVisible(true);
            }
        });
    }
    private int tope=0;// lleva el # de nodos creado 
    private int nodoFin;
    private int permanente;
    int n=0,nn=0,id,id2;// permite controlar que se halla dado click sobre un nodo
    private double aristaMayor;
 
   
 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAzul;
    private javax.swing.JButton botonAzul2;
    private javax.swing.JButton botonAzulito;
    private javax.swing.JButton botonBlanco;
    private javax.swing.JButton botonGris;
    private javax.swing.JButton botonGris2;
    private javax.swing.JButton botonGris3;
    private javax.swing.JButton botonPurpura;
    private javax.swing.JButton botonRepain;
    private javax.swing.JButton botonRojo;
    private javax.swing.JButton botonRosa;
    private javax.swing.JButton botonVerde1;
    private javax.swing.JButton botonVerde2;
    private javax.swing.JButton jButton14;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel jmapa;
    private javax.swing.JTextField jtacumulado;
    private javax.swing.JMenuItem opcioNvaArista;
    private javax.swing.JMenuItem opcionDijkstra;
    private javax.swing.JMenuItem opcionGrafoDefault;
    private javax.swing.JMenuItem opcionMatrizAdyacencia;
    private javax.swing.JMenuItem opcionMatrizPesos;
    // End of variables declaration//GEN-END:variables
}
