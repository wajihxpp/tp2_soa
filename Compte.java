package service;

public class Compte {
    private String code;
    private double solde;
    private String dateCreation;

    public Compte(String code, double solde, String dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public void setCode(String code) {
		this.code = code;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public String getDateCreation() {
        return dateCreation;
    }
}

