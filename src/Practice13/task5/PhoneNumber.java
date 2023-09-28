package Practice13.task5;

public class PhoneNumber {
    String phone;

    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber("+2021234567890");
        PhoneNumber p2 = new PhoneNumber("89134222222");
        System.out.println(p1);
        System.out.println(p2);
    }

    public PhoneNumber(String phone) {
        setPhone(phone);
    }

    public void setPhone(String phone) {
        StringBuilder s = new StringBuilder();
        String countryCode = "0";
        String number10digits = "0000000000";
        if (phone.startsWith("8")){
            countryCode = "7";
            number10digits = phone.substring(1);
        }
        else if (phone.startsWith("+")){
            number10digits = phone.substring(phone.length()-11);
            countryCode = phone.substring(1, phone.length()-11);
        }
        s.append("+");
        s.append(countryCode);
        s.append(number10digits, 0, 3);
        s.append("-");
        s.append(number10digits, 3, 6);
        s.append("-");
        s.append(number10digits.substring(6));
        this.phone = s.toString();



    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
