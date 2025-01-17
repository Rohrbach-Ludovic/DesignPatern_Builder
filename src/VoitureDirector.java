public class VoitureDirector {
    public static Voiture makePeugeot(){
        return new Voiture.BuilderVoiture("Peugeot").addOptions("MOTEUR").addOptions("Pare_Brise").build();
    }
}
