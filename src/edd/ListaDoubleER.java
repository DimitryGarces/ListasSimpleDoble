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
public class ListaDoubleER
{

    private NodoDouble end = null;
    private NodoDouble front = null;

    public void insertLast(NodoDouble nodo)
    {
        if (end == null || front == null)
        {
            front = end = nodo;
        } else
        {
            nodo.setSig(end);
            end.setAnt(nodo);
            end = nodo;
        }
    }

    public void insertFrist(NodoDouble nodo)
    {
        if (end == null || front == null)
        {
            front = end = nodo;
        } else
        {
            nodo.setAnt(front);
            front.setSig(nodo);
            front = nodo;
        }
    }

    public NodoDouble deleteFirst()
    { 
        NodoDouble aux = front;
        if (front == end)
        {
            front = end = null;
            return aux;
        } else
        {
            front.getAnt().setSig(null);
            front = front.getAnt();
            return aux;
        }
    }

    public boolean empty()
    {
        return end == null;
    }

    public NodoDouble getEnd()
    {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(NodoDouble end)
    {
        this.end = end;
    }

    /**
     * @return the front
     */
    public NodoDouble getFront()
    {
        return front;
    }

    /**
     * @param front the front to set
     */
    public void setFront(NodoDouble front)
    {
        this.front = front;
    }

}
