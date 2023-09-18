package Practice3;

public class task6 {
    public static void main(String[] args) {
        String string_of_number = "8.83";
        Double d1 = Double.valueOf("8.83"); //1)
        Double d2 = 8.83d; //1)
        double d3 = Double.parseDouble(string_of_number); //2)
        byte byte_d = d1.byteValue(); //3)
        int int_d = d1.intValue(); //3)
        short short_d = d1.shortValue(); //3)
        long long_d = d1.longValue(); //3)
        float float_d = d1.floatValue(); //3)
        double double_d = d1.doubleValue(); //3)
        System.out.println(d1); //4)
        String string_double = Double.toString(2.413); //5)



    }
}
