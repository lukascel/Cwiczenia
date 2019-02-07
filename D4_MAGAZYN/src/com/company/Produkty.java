package com.company;

import java.math.BigDecimal;

public class Produkty {

    public String marka;
    public String kolor;
    public String smak;
    public BigDecimal cenaNetto;
    public BigDecimal vat;
    public BigDecimal cenaBrutto = getCenaNetto().multiply(getVat());

    public Produkty(String marka, String kolor, String smak, BigDecimal cenaNetto, BigDecimal vat) {
        setMarka(marka);
        setKolor(kolor);
        setSmak(smak);
        setCenaNetto(cenaNetto);
        setVat(vat);
        setCenaBrutto(getCenaNetto().multiply(getVat()));
    }

    public String getMarka() {
        return marka;
    }

    public String getKolor() {
        return kolor;
    }

    public String getSmak() {
        return smak;
    }

    public BigDecimal getCenaNetto() {
        return cenaNetto;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public BigDecimal getCenaBrutto() {
        return cenaBrutto;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setSmak(String smak) {
        this.smak = smak;
    }

    public void setCenaNetto(BigDecimal cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public void setCenaBrutto(BigDecimal cenaBrutto) {
        this.cenaBrutto = cenaBrutto;
    }

    @Override
    public String toString() {
        return "Produkty{" +
                "marka='" + marka + '\'' +
                ", kolor='" + kolor + '\'' +
                ", smak='" + smak + '\'' +
                ", cenaNetto=" + cenaNetto +
                ", vat=" + vat +
                ", cenaBrutto=" + cenaBrutto +
                '}';
    }
}
