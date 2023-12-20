
package ec.edu.ups.practica04_interfazgrafica;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Practica04_InterfazGrafica {

    public static void main(String[] args) {
        // pagina principal 
        MiVentana v1 = new MiVentana("Pagina Principal", 800, 600);
        Panel panelGeneral = new Panel();      
        Label encabezado = new Label("Bienbenido al sistema de Biblioteca", Label.CENTER);
        Label opciones = new Label("Seleccione la Opcion", Label.CENTER);
        Label espacio = new Label("                    ");
        GridLayout matriz = new GridLayout(7, 1);      
        
        Button boton1 = new Button("Biblioteca");
        Button boton2 = new Button("Usuario");
        Button boton3 = new Button("Libro");
        Button boton4 = new Button("Prestamo");       
        
        panelGeneral.setLayout(matriz);             
        v1.add(panelGeneral);
        panelGeneral.add(encabezado);
        panelGeneral.add(espacio);
        panelGeneral.add(opciones);
        panelGeneral.add(boton1);     
        panelGeneral.add(boton2);      
        panelGeneral.add(boton3);    
        panelGeneral.add(boton4);
    
        
        //Menu Biblioteca
        MiVentana v2 = new MiVentana("Biblioteca", 600, 400);
        Panel panelGeneralB = new Panel();
        Label EncabezadoB = new Label("Menu de Biblioteca", Label.CENTER); 
        Label espacioB = new Label("                    ");
        GridLayout matrizB = new GridLayout(7, 1);
        TextField buscadorB = new TextField ("ingrese el nombre de la biblioteca a buscar", 80);
        
        Button botonB1 = new Button("Crear Bbiblioteca");
        Button botonB2 = new Button("Actualicar Biblioteca");
        Button botonB3 = new Button("Eliminar Biblioteca");
        Button botonB4 = new Button("Buscar");
        
        panelGeneralB.setLayout(matrizB);
        v2.add(panelGeneralB);
        panelGeneralB.add(EncabezadoB);
        panelGeneralB.add(buscadorB);
        panelGeneralB.add(botonB4);
        panelGeneralB.add(espacioB);
        panelGeneralB.add(botonB1);     
        panelGeneralB.add(botonB2);     
        panelGeneralB.add(botonB3);
        
        //Crear o actualizar Biblioteca
        MiVentana vB = new MiVentana("Gestor de Biblioteca", 400, 200);
        Panel panelGeneralb = new Panel();
        Label EncabezadoB1 = new Label("Ingrese/Actualice una biblioteca", Label.CENTER); 
        TextField buscadorB1 = new TextField ("ingrese el nombre de la biblioteca", 50);
        TextField buscadorB2 = new TextField ("ingrese la direccion de la biblioteca", 50);
        Button botonb1 = new Button("Aceptar");
        
        panelGeneralb.setLayout(matrizB);
        vB.add(panelGeneralb);
        panelGeneralb.add(EncabezadoB1);
        panelGeneralb.add(buscadorB1);
        panelGeneralb.add(buscadorB2);         
        panelGeneralb.add(botonb1);
        //eliminar biblioteca
        MiVentana vBe = new MiVentana("Eliminar una Biblioteca", 400, 200);
        Panel panelGeneralbE = new Panel();
        Label EncabezadoBE1 = new Label("Elimine una biblioteca", Label.CENTER); 
        TextField textoE = new TextField ("ingrese el nombre de la biblioteca a eliminar", 50);
        Button botonbE1 = new Button("Eliminar");
        
        panelGeneralbE.setLayout(matrizB);
        vBe.add(panelGeneralbE);
        panelGeneralbE.add(EncabezadoBE1);
        panelGeneralbE.add(textoE);       
        panelGeneralbE.add(botonbE1);
        
        //Menu Libro
        MiVentana v3 = new MiVentana("Libro", 600, 400);
        Panel panelGeneralL = new Panel();
        Label EncabezadoL = new Label("Menu de Libro", Label.CENTER);    
        Label espacioL = new Label("                    ");
        GridLayout matrizL = new GridLayout(7, 1);
        TextField buscadorL = new TextField ("ingrese el titulo, autor o año del libro a buscar", 80);
        
        Button botonL1 = new Button("Crear Libro");
        Button botonL2 = new Button("Actualicar Libro");
        Button botonL3 = new Button("Eliminar Libro");
        Button botonL4 = new Button("Buscar");
        
        panelGeneralL.setLayout(matrizL);
        v3.add(panelGeneralL);
        panelGeneralL.add(EncabezadoL);
        panelGeneralL.add(buscadorL);
        panelGeneralL.add(botonL4);
        panelGeneralL.add(espacioL);
        panelGeneralL.add(botonL1);     
        panelGeneralL.add(botonL2);     
        panelGeneralL.add(botonL3);
        
        //Crear o actualizar Libro
        MiVentana vL = new MiVentana("Gestor de Libro", 400, 200);
        Panel panelGenerall = new Panel();
        Label EncabezadoL1 = new Label("Ingrese/Actualice un Libro", Label.CENTER); 
        TextField buscadorL1 = new TextField ("ingrese el titulo del libro", 50);
        TextField buscadorL2 = new TextField ("ingrese el autor del libro", 50);
        TextField buscadorL3 = new TextField ("ingrese el año de publicacion", 50);
        Button botonl1 = new Button("Aceptar");
        
        panelGenerall.setLayout(matrizB);
        vL.add(panelGenerall);
        panelGenerall.add(EncabezadoL1);
        panelGenerall.add(buscadorL1);
        panelGenerall.add(buscadorL2);
        panelGenerall.add(buscadorL3);       
        panelGenerall.add(botonl1);
        //eliminar libro
        MiVentana vLe = new MiVentana("Eliminar un libro", 400, 200);
        Panel panelGenerallE = new Panel();
        Label EncabezadolE1 = new Label("Elimine un libro", Label.CENTER); 
        TextField textoL = new TextField ("ingrese el titulo del libro a eliminar", 50);
        Button botonbL1 = new Button("Eliminar");
        
        panelGenerallE.setLayout(matrizB);
        vLe.add(panelGenerallE);
        panelGenerallE.add(EncabezadolE1);
        panelGenerallE.add(textoL);       
        panelGenerallE.add(botonbL1);
       
        
        //Menu Usuario
        MiVentana v4 = new MiVentana("Usuario", 600, 400);
        Panel panelGeneralU = new Panel();
        Label EncabezadoU = new Label("Menu de Usuario", Label.CENTER);  
        Label espacioU = new Label("                    ");
        GridLayout matrizU = new GridLayout(7, 1);
        TextField buscadorU = new TextField ("ingrese la identificacion del usuario a buscar", 80);     
        
        Button botonU1 = new Button("Registrar Usuario");
        Button botonU2 = new Button("Actualicar Usuario");
        Button botonU3 = new Button("Eliminar Usuario");
        Button botonU4 = new Button("Buscar");
        
        panelGeneralU.setLayout(matrizU);
        v4.add(panelGeneralU);
        panelGeneralU.add(EncabezadoU);
        panelGeneralU.add(buscadorU);
        panelGeneralU.add(botonU4);
        panelGeneralU.add(espacioU);
        panelGeneralU.add(botonU1);     
        panelGeneralU.add(botonU2);     
        panelGeneralU.add(botonU3);
        
        //Crear o actualizar Usuario
        MiVentana vU = new MiVentana("Gestor de Usuario", 400, 200);
        Panel panelGeneralu = new Panel();
        Label EncabezadoU1 = new Label("Ingrese/Actualice un Usuario", Label.CENTER); 
        TextField buscadorU1 = new TextField ("ingrese el nombre del usuario", 50);
        TextField buscadorU2 = new TextField ("ingrese su correo", 50);
        TextField buscadorU3 = new TextField ("ingrese su identificacion", 50);
        Button botonu1 = new Button("Aceptar");
        
        panelGeneralu.setLayout(matrizB);
        vU.add(panelGeneralu);
        panelGeneralu.add(EncabezadoU1);
        panelGeneralu.add(buscadorU1);
        panelGeneralu.add(buscadorU2);
        panelGeneralu.add(buscadorU3);       
        panelGeneralu.add(botonu1);
        //eliminar libro
        MiVentana vUe = new MiVentana("Eliminar un Usuario", 400, 200);
        Panel panelGeneraluE = new Panel();
        Label EncabezadouE1 = new Label("Elimine un Usuario", Label.CENTER); 
        TextField textoU = new TextField ("ingrese la identificaion del usario a eliminar", 50);
        Button botonbU1 = new Button("Eliminar");
        
        panelGeneraluE.setLayout(matrizB);
        vUe.add(panelGeneraluE);
        panelGeneraluE.add(EncabezadouE1);
        panelGeneraluE.add(textoU);       
        panelGeneraluE.add(botonbU1);
        
        
        //Menu Prestamo
        MiVentana v5 = new MiVentana("Prestamo", 600, 400);
        Panel panelGeneralP = new Panel();
        Label EncabezadoP = new Label("Menu de Prestamos", Label.CENTER);  
        Label espacioP = new Label("                    ");
        GridLayout matrizP = new GridLayout(7, 1);
        TextField buscadorP = new TextField ("ingrese la fecha del prestamo a buscar", 80);     
        
        Button botonP1 = new Button("Ingresar Prestamo");
        Button botonP2 = new Button("Actualicar Prestamo");
        Button botonP3 = new Button("Eliminar Prestamo");
        Button botonP4 = new Button("Buscar");
        
        panelGeneralP.setLayout(matrizP);
        v5.add(panelGeneralP);
        panelGeneralP.add(EncabezadoP);
        panelGeneralP.add(buscadorP);
        panelGeneralP.add(botonP4);
        panelGeneralP.add(espacioP);
        panelGeneralP.add(botonP1);     
        panelGeneralP.add(botonP2);     
        panelGeneralP.add(botonP3);
        
        //Crear o actualizar Prestamo
        MiVentana vP = new MiVentana("Gestor de Prestamo", 400, 200);
        Panel panelGeneralp = new Panel();
        Label EncabezadoP1 = new Label("Ingrese/Actualice un Prestamo", Label.CENTER);
        Label EncabezadoP2 = new Label("Ingrese la fecha del prestamo", Label.CENTER);
        Label espacioP2 = new Label("                                ", Label.CENTER);
        TextField buscadorP1 = new TextField ("ingrese el dia", 50);
        TextField buscadorP2 = new TextField ("ingrese el mes", 50);
        TextField buscadorP3 = new TextField ("ingrese el año", 50);
        Button botonp1 = new Button("Aceptar");
        
        panelGeneralp.setLayout(matrizB);
        vP.add(panelGeneralp);
        panelGeneralp.add(EncabezadoP1);
        panelGeneralp.add(espacioP2);
        panelGeneralp.add(EncabezadoP2);
        panelGeneralp.add(buscadorP1);
        panelGeneralp.add(buscadorP2);  
        panelGeneralp.add(buscadorP3);
        panelGeneralp.add(botonp1);
        //eliminar Prestamo
        MiVentana vPe = new MiVentana("Eliminar un Prestamo", 400, 200);
        Panel panelGeneralpE = new Panel();
        Label EncabezadopE1 = new Label("Ingrese la fecha del prestamo a eliminar", Label.CENTER); 
        TextField textoP1 = new TextField ("ingrese el dia ", 50);
        TextField textoP2 = new TextField ("ingrese el mes ", 50);
        TextField textoP3 = new TextField ("ingrese el año ", 50);
        Button botonbP1 = new Button("Eliminar");
        
        panelGeneralpE.setLayout(matrizB);
        vPe.add(panelGeneralpE);
        panelGeneralpE.add(EncabezadopE1);
        panelGeneralpE.add(textoP1);
        panelGeneralpE.add(textoP2);  
        panelGeneralpE.add(textoP3);  
        panelGeneralpE.add(botonbP1);
        
    }
}
