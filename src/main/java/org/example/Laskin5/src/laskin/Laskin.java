package org.example.Laskin5.src.laskin;

public class Laskin {

    private int tulos;  	// Muuttuja tulokselle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public int annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;
    }

    public void kerro(int n) { tulos = tulos * n;
        // Ei vielä toteutettu
    }

    public void jaa(int n) {
        if (n==0) throw new ArithmeticException("Nollalla ei voi jakaa");
    	// if (n==0) throw new ArithmeticException("Nollalla ei voi jakaa");
        tulos = tulos / n;

    }

    public void nelio(int n) {
        tulos = (int) Math.pow(n, 2);
    }

    public void neliojuuri(int n) {
        if (n < 0) throw new ArithmeticException("Negatiiviselle luvulle ei voi laskea neliöjuurta");
    	tulos =  (int)Math.sqrt(n);
    }

    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0;
    }

    public void virtaOFF() {
        tulos = 0;
        // Tähän voisi laittaa lopputoimet
    }

}
