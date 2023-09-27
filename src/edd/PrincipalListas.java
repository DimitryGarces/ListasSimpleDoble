/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

import java.util.Scanner;

/**
 *
 * @author DimitryGarces
 */
public class PrincipalListas
{
    public static void main(String[] args)
    {
        Scanner r= new Scanner(System.in);
        int opc=0;
        ListaSimplePila obList = new ListaSimplePila();
        do{
            System.out.println("1.- Add");
            System.out.println("2.- Delete");
            System.out.println("3.- Show");
            System.out.println("4.- Exit");
            opc= r.nextInt();
            switch(opc){
                case 1:
                    System.out.println("\n\n\n");
                    System.out.println("Insert num: ");
                    int num = r.nextInt();
                    NodoNum obN = new NodoNum();
                    obN.setNum(num);
                    obList.insert(obN);
                    break;
                case 2:
                    System.out.println("\n\n\n");
                    if (!obList.empty())
                    {
                        NodoNum delete= obList.delete();
                        System.out.println("Date delete: "+delete);
                    }else{
                        System.out.println("List is clear");
                    }
                    break;
                case 3:
                    System.out.println("\n\n\n");
                    if (!obList.empty())
                    {
                        obList.show();
                    }else{
                        System.out.println("List is clear");
                    }
                    break;
                case 4:
                    //salir
                    break;
                default:
                    System.out.println("Error, try again.");
            }
        }while(opc!= 4);
    }
    
}
