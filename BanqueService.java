package service;

import java.util.ArrayList;
import java.util.List;

public class BanqueService {
    private List<Compte> comptes = new ArrayList<>();

    public List<Compte> getComptes() {
        return comptes;
    }

    public void addCompte(Compte compte) {
        comptes.add(compte);
    }

    public Compte getCompte(String code) {
        for (Compte compte : comptes) {
            if (compte.getCode().equals(code)) {
                return compte;
            }
        }
        return null; 
    }

    public double conversion(double montant, String sourceCurrency, String targetCurrency) {
       
        double usdToEurRate = 0.33;

        if ("TND".equals(sourceCurrency) && "EUR".equals(targetCurrency)) {
           
            return montant * usdToEurRate;
        } else if ("EUR".equals(sourceCurrency) && "TND".equals(targetCurrency)) {
        
            return montant / usdToEurRate;
        } else {
            
            throw new IllegalArgumentException("Unsupported currency conversion: " + sourceCurrency + " to " + targetCurrency);
        }
    }
}
