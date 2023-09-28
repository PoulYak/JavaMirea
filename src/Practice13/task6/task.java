package Practice13.task6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String filename = sc.next();
        System.out.println(getLine("notes3.txt"));

    }

    public static String getLine(String filename){
        StringBuilder sb = new StringBuilder();
        try(FileReader reader = new FileReader("src/Practice13/task6/"+filename))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                sb.append((char) c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println(sb);
        ArrayList<String> list = new ArrayList<>(List.of(sb.toString().split("\\s+")));
        System.out.println(list);
        HashMap<Character, ArrayList<String>> startswith = new HashMap<>();
        HashMap<Character, ArrayList<String>> endsswith = new HashMap<>();
        for (String string: list){
            string = string.toLowerCase();
            Character key1 = string.charAt(0);
            Character key2 = string.charAt(string.length()-1);
            ArrayList<String> temps;
            if (startswith.containsKey(key1)){
                temps = startswith.get(key1);
                temps.add(string);
                startswith.put(key1,temps) ;
            }
            else{
                temps =new ArrayList<>();
                temps.add(string);
                startswith.put(key1, temps);
            }
            if (endsswith.containsKey(key2)){
                temps = endsswith.get(key2);
                temps.add(string);
                endsswith.put(key2,temps) ;
            }
            else {
                temps = new ArrayList<>();
                temps.add(string);
                endsswith.put(key2, temps);
            }

        }

//        System.out.println(startswith);
//        System.out.println(endsswith);
        char firstchar = (char) startswith.keySet().toArray()[(int) (Math.random()*(startswith.size()))];
        boolean inProcess = true;
        StringBuilder stringBuilder = new StringBuilder();
        while (inProcess){
            ArrayList<String> temp;

            String tempString;
            if (startswith.containsKey(firstchar)){
                temp = startswith.get(firstchar);
                if (!temp.isEmpty()){
                    tempString = temp.remove(0);
                    stringBuilder.append(" ");
                    stringBuilder.append(tempString);
                    firstchar = tempString.toLowerCase().charAt(tempString.length()-1);
                }

                else
                    inProcess = false;
            }
            else
                inProcess = false;

        }

        return stringBuilder.toString();
    }
}
