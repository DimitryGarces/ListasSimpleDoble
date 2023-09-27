/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author DimitryGarces
 */
public class ListaSimplePila
{
    private NodoNum tope;

    public void insert(NodoNum obj){
        obj.setSig(tope);
        tope= obj;
    }
    public NodoNum delete(){
        NodoNum aux= tope;
        tope= tope.getSig();
        return aux;
    }
    public void show(){
        NodoNum aux= tope;
        while(aux != null){
            System.out.println(aux.getNum());
            aux=aux.getSig();
        }
    }
    public boolean empty(){
        return tope == null;
    }
    public NodoNum getTope()
    {
        return tope;
    }

    /**
     * @param tope the tope to set
     */
    public void setTope(NodoNum tope)
    {
        this.tope = tope;
    }
    
}
