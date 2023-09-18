package Practice7.task5;

public class ProcessString implements Stringable {
    public static void main(String[] args) {
        ProcessString ps = new ProcessString();
        System.out.println(ps.getOddSymbols("Как дела"));
        System.out.println(ps.countSymbols("Что такое?"));
        System.out.println(ps.getInvert("Что такое?"));
    }

    @Override
    public int countSymbols(String s) {
        return s.length();
    }

    @Override
    public String getOddSymbols(String s) {
        String newStr = "";
        for (int i=0; i<s.length(); i+=2){
            newStr = newStr + s.substring(i, i+1);
        }
        return newStr;
    }

    @Override
    public String getInvert(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
