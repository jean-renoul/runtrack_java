package job08;

public class Facture {
    public static void main(String args[]){
        double prix = 49.99;
        int quantite = 3;
        double tarifHT = prix * quantite;
        double TVA = tarifHT * 0.2;
        double tarifTTC = tarifHT + TVA;
        System.out.println("Prix total HT : " + tarifHT);
        System.out.println("TVA : " + TVA);
        System.out.println("Prix total TTC : " + tarifTTC);

    }
}
