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
public class NodoNum
{
    private int num;
    private NodoNum sig;

    /**
     * @return the num
     */
    public int getNum()
    {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num)
    {
        this.num = num;
    }

    /**
     * @return the sig
     */
    public NodoNum getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(NodoNum sig)
    {
        this.sig = sig;
    }
}
