/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cenfotec.entities;

/**
 *
 * @author alego
 */
public class Vigenere {
 
    public String TxT;
    public String Seed;
    
    private final String Charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public Vigenere(){ }
    
    public Vigenere(String TxT,String Seed){
        this.Seed = Desn(Seed);
        this.TxT = TxT;
    }
    
    public String Cifrar(){
        String Cifrado = "",a=TxT.toUpperCase();
        for(int n = 0,c=0;n<TxT.length();n++,c = (c+1)%Seed.length()){
                if(Charset.indexOf(a.charAt(n))!=-1){
                int tmp = (Charset.indexOf(a.charAt(n))+Charset.indexOf(Seed.charAt(c)))%Charset.length();
                Cifrado+=(Charset.indexOf(TxT.charAt(n))!=-1)?Charset.charAt(tmp):String.valueOf(Charset.charAt(tmp)).toUpperCase();
            }else{
                c-=1;
                Cifrado+=TxT.charAt(n);
            }
        }
        return Cifrado;
    }
    
    public String Cifrar2(){
        String DesCifrado = "";
        String a = TxT.toUpperCase();
        for(int n = 0 , c=0; n < a.length(); n++, c =(c+1)%Seed.length()){
            if(Charset.indexOf(a.charAt(n))!=-1){
                int tmp = (Charset.indexOf(a.charAt(n))-Charset.indexOf(Seed.charAt(c)));
                tmp = (tmp<0)?(tmp+Charset.length()):tmp;
                DesCifrado+=(Charset.indexOf(TxT.charAt(n))!=-1)?Charset.charAt(tmp):String.valueOf(Charset.charAt(tmp)).toUpperCase();
            }else{
                c-=1;
                DesCifrado+=TxT.charAt(n);
            }
        }
        return DesCifrado;
    }
    
    public String DesCifrar(){
        String DesCifrado = "";
        String a = TxT.toLowerCase();
        for(int n = 0 , c=0; n < a.length(); n++, c =(c+1)%Seed.length()){
            if(Charset.indexOf(a.charAt(n))!=-1){
                int tmp = (Charset.indexOf(a.charAt(n))-Charset.indexOf(Seed.charAt(c)));
                tmp = (tmp<0)?(tmp+Charset.length()):tmp;
                DesCifrado+=(Charset.indexOf(TxT.charAt(n))!=-1)?Charset.charAt(tmp):String.valueOf(Charset.charAt(tmp)).toLowerCase();
            }else{
                c-=1;
                DesCifrado+=TxT.charAt(n);
            }
        }
        return DesCifrado;
    }
    
    public String Desn(String a){
        String b = "";
        for(int n = 0;n<a.length();n++){
            if((Charset.indexOf(a.charAt(n))!=-1)||(Charset.indexOf(String.valueOf(a.charAt(n)).toUpperCase())!=-1))
            b+=a.charAt(n);
        }
        return b;
    }
    
}
