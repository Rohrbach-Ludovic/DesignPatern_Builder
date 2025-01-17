import java.util.ArrayList;

public class Voiture {


    private ArrayList<String> options = new ArrayList<String>();

    private String marque = "";

    private Voiture(BuilderVoiture builder){
        this.marque = builder.marque;
        this.options = builder.options;
    }

    public static class BuilderVoiture {
        private String marque = "";
        private final ArrayList<String> options = new ArrayList<String>();

        public BuilderVoiture(String marque) {
            this.marque = marque;
        }

        public BuilderVoiture addOptions(String item){
            this.options.add(item);
            return this;
        }

        public Voiture build(){
            return new Voiture(this);
        }
    }
}
