package com.company;

import java.util.LinkedList;
import java.util.List;

public class Operacje {

    public List<Produkty> produktyLista = new LinkedList<>();

    public void addToProduktyLista(Produkty produkt) {
        produktyLista.add(produkt);
        StanMagazynu.stanMagazynu++;
    }

    public void removeFromProduktyLista(Produkty produkt) {
        produktyLista.remove(produkt);
        StanMagazynu.stanMagazynu--;
    }

    public void przyjmijProdukty (Produkty produkt, int iloscButelek){
        for (int i = 0; i<=iloscButelek; i++){
            addToProduktyLista(produkt);}
    }

    public void wydajProdukty (Produkty produkt, int iloscButelek) {
        for (int i = 0; i <= iloscButelek; i--) {
            removeFromProduktyLista(produkt);
        }
    }

    public void kasuj(Produkty produkt, Produkty cenaNetto, Produkty vat, Produkty cenaBrutto) {
        System.out.println("kupiłeś:" + " " + produkt + "\n" + "cena netto: " + cenaNetto + " zł," +
                "VAT: " + vat + "%" + "\n" + "Cena brutto: " + cenaBrutto);
        removeFromProduktyLista(produkt);
        StanMagazynu.stanMagazynu--;
    }

    public void kasuj(Produkty produkt, int ilosc, Produkty cenaNetto, Produkty vat, Produkty cenaBrutto) {
        System.out.println("kupiłeś: " + ilosc + " " + produkt + "\n" + "cena netto: " + cenaNetto + " zł," +
                "VAT: " + vat + "%" + "\n" + "Cena brutto: " + cenaBrutto);
        for (int i = 0; i<=ilosc; i++){
            removeFromProduktyLista(produkt);}
        StanMagazynu.stanMagazynu -= ilosc;

    }
}
