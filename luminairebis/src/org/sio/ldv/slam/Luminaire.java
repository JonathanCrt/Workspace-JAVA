package org.sio.ldv.slam;

public class Luminaire implements Eclairage {

    private AmpouleIncandescente ampoule1;
    private AmpouleIncandescente ampoule2;
    private AmpouleIncandescente ampoule3;
    private AmpouleIncandescente ampoule4;

    public Luminaire() {
        ampoule1 = new AmpouleIncandescente();
        ampoule2 = new AmpouleIncandescente();
        ampoule3 = new AmpouleIncandescente();
        ampoule4 = new AmpouleIncandescente();

    }

    @Override
    public void allumer() {
        ampoule1.allumer();
        ampoule2.allumer();
        ampoule3.allumer();
        ampoule4.allumer();

    }

    @Override
    public void eteindre() {
        ampoule1.eteindre();
        ampoule2.eteindre();
        ampoule3.eteindre();
        ampoule4.eteindre();

    }

    @Override
    public void intensifier() {
        ampoule1.intensifier();
        ampoule2.intensifier();
        ampoule3.intensifier();
        ampoule4.intensifier();
    }

    @Override
    public void diminuer() {
        ampoule1.diminuer();
        ampoule2.diminuer();
        ampoule3.diminuer();
        ampoule4.diminuer();

    }

    /**
     * Retourne l'état du luminaire dans l'intervalle [0..10] ou -1 si il est en
     * panne. L'état résultant est la plus grande valeur des états des 4
     * ampoules du luminaire
     * 
     * @return l'état du luminaire
     */
    @Override
    public int etat() {
        int etat;
        etat = ampoule1.etat();
        if (ampoule2.etat() > etat) {
            etat = ampoule2.etat();
        }
        if (ampoule3.etat() > etat) {
            etat = ampoule3.etat();
        }
        if (ampoule4.etat() > etat) {
            etat = ampoule4.etat();
        }
        return etat;
    }

    public String toString() {
        return  "Etat du luminaire : \n"+
        		this.ampoule1+"\n"
                + this.ampoule2+" \n"
                + this.ampoule3+"\n"
                + this.ampoule4+"\n";
    }
   

}