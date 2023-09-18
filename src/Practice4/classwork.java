package Practice4;



public class classwork {
    public enum Level{
        HIGH,
        MEDIUM,
        LOW
    }
    public enum Level2 {
        HIGH(3), //вызов конструктора со значением 3
        MEDIUM(2), // вызов конструктора со значением 2;

        LOW(1); // вызов конструктора со значением 1
        private final int levelCode;
        private Level2(int levelCode) {
            this.levelCode = levelCode;
        }

        public int getLevelCode() {
            return levelCode;
        }
    }

    public static void main(String[] args) {

        Level level = Level.LOW;
        if (level == Level.HIGH)
            {} else if (level==Level.LOW) {

        } else if (level==Level.MEDIUM) {

        }
        switch (level){
            case LOW -> {
                break;
            }
            case HIGH -> {
                break;
            }
            case MEDIUM -> {
                break;
            }
            default -> {
                break;
            }


        }
        for(Level level1: Level.values()){
            System.out.println(level1);
        }
        Level level2 = Level.valueOf ("HIGH");
        Level2 level3 = Level2.HIGH;
        System.out.println (level3.getLevelCode ());
    }
}
