public class Main {
    public static void main(String[] args) {
        Voiture peugeot = VoitureDirector.makePeugeot();
        Voiture custom = new Voiture.BuilderVoiture("Volvo").addOptions(EOptions.Volant).addOptions(EOptions.Moteur).build();

        System.out.println(custom.toString());
        System.out.println(peugeot.toString());
    }
}