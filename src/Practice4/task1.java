package Practice4;

enum Seasons{
    SUMMER(22.3){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10.2),
    WINTER(-15.9),
    SPRING(10.3);

    Seasons(double avg) {
        this.avg = avg;
    }

    public String getDescription(){
        return "Холодное время года";
    }



    private double avg;
    public static void whatDoYou(Seasons s){
        switch (s){
            case AUTUMN -> System.out.println("Я люблю осень");
            case SUMMER -> System.out.println("Я люблю лето");
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
        }
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
public class task1 {

    public static void main(String[] args) {
        Seasons s = Seasons.SPRING;
        System.out.println(s+" Средняя температура: "+s.getDescription());
        Seasons.whatDoYou(s);
        System.out.println(s.getDescription());
        for (Seasons season: Seasons.values()){
            System.out.println(season+" "+season.getAvg()+" "+season.getDescription());
        }
    }


}
