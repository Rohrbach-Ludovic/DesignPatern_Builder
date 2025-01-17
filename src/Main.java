public class Main {
    public static void main(String[] args) {
        Voiture peugeot = VoitureDirector.makePeugeot();
        Voiture custom = new Voiture.BuilderVoiture("Volvo").addOptions("Volant").build();
    }
}