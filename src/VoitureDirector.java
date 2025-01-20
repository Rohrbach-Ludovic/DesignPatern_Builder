public class VoitureDirector {
    public static Voiture makePeugeot(){
        return new Voiture.BuilderVoiture("Peugeot").addOptions(EOptions.Moteur).addOptions(EOptions.Moteur).addOptions(EOptions.Boite_auto).build();
    }
}
