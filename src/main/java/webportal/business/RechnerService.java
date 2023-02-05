package webportal.business;

import org.springframework.stereotype.Service;

@Service
public class RechnerService {

    private final double zinsfaktor = 1.02;
    private final int jahresfaktor = 20;


    public double renteBerechnen(int alter, Long monatlicherBeitrag, int eintrittsalter) {
        if (alter >= eintrittsalter || monatlicherBeitrag <= 0) {
            return (long) -1; //ungültige Angaben
        } else {
            return monatlicheRenteBerechnen(alter, monatlicherBeitrag, eintrittsalter);
        }
    }

    private double monatlicheRenteBerechnen(int alter, double monatlicherBeitrag, int eintrittsalter) {
        double beitraege = (eintrittsalter - alter) * 12 * monatlicherBeitrag;
        double ergebnis = (beitraege * zinsfaktor) / jahresfaktor;
        return Math.rint(ergebnis * 100) / 100;
    }
}
