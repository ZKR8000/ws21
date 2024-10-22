package ws;

import java.util.Date;

public class Compte {
    private int code;
    private double solde ;
    private Date datecreation;

    public Compte( int code, double solde, Date datecreation ) {
        this.code = code;
        this.solde = solde;
        this.datecreation = datecreation;
    }
    public Compte(){

    }
}
