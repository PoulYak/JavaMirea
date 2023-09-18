package Practice4_1;

import java.util.Arrays;

class Phone{
    public static void main(String[] args) {
        Phone phone1 = new Phone("+7(913)233-22-34", "samsung", 223.4);
        Phone phone2 = new Phone("+7(913)233-22-35", "Iphone", 203.4);
        Phone phone3 = new Phone("+7(913)233-22-36", "Xiaomi", 123.4);
        phone1.receiveCall(phone2.getNumber());
        phone2.receiveCall(phone3.getNumber());
        phone3.receiveCall(phone1.getNumber());
        phone3.receiveCall("Руслан", phone1.getNumber());
        String[] mass = {phone1.getNumber(), phone2.getNumber()};
        phone3.sendMessage(mass);

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    private String number;
    private String model;
    private double weight;


    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String callerName){
        System.out.printf("Звонит %s\n", callerName);
    }

    public void receiveCall(String callerName, String callerPhone){
        System.out.printf("Звонит %1$s c номера %2$s\n", callerName,callerPhone);
    }

    public void sendMessage(String[] s){
        System.out.print("Сообщение отправлено на номера: ");
        for (int i=0; i<s.length; i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getNumber() {
        return number;
    }

}
