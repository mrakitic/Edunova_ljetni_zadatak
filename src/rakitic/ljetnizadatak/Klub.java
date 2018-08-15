/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakitic.ljetnizadatak;

/**
 *
 * @author Borna
 */
public class Klub {
    private int sifra;
    private String nazivKluba;
    private String imeStadiona;
    private String grad;

    public Klub(int sifra, String nazivKluba, String imeStadiona, String grad) {
        this.sifra = sifra;
        this.nazivKluba = nazivKluba;
        this.imeStadiona = imeStadiona;
        this.grad = grad;
    }
    
    
    public Klub(){
        
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNazivKluba() {
        return nazivKluba;
    }

    public void setNazivKluba(String nazivKluba) {
        this.nazivKluba = nazivKluba;
    }

    public String getImeStadiona() {
        return imeStadiona;
    }

    public void setImeStadiona(String imeStadiona) {
        this.imeStadiona = imeStadiona;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
        
        
    }
    @Override
    public String toString(){
        return String.format("klub [sifra=%s,Naziv kluba=%s,Ime Stadiona=%s,Grad=%s]" , sifra,nazivKluba,imeStadiona,grad);
        
    }
   
}
