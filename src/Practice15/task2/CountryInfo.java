package Practice15.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountryInfo extends JFrame {

    public CountryInfo() {

        super("Тестовое окно");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {
                "Australia",
                "China",
                "England",
                "Russia"
        };
        String[] infos = {
                "Австралия – это страна, занимающая одноименный материк, который омывается Индийским и Тихим океанами. На побережьях континента находятся такие крупные города, как Сидней, Брисбен, Мельбурн, Перт и Аделаида. Столица Австралии – Канберра – расположена вдали от моря. Главными достопримечательностями страны являются Сиднейский оперный театр, Большой Барьерный риф и аутбэк – обширная пустынная местность. ",
                "Китай – густонаселенная страна в Восточной Азии с разнообразными ландшафтами и рельефом. Здесь можно найти луга, пустыни, горы, озера, реки и побережья протяженностью более 14 тыс. км. Столица страны, Пекин, славится современной архитектурой и древними памятниками, среди которых дворцовый комплекс Запретный город и площадь Тяньаньмэнь. На востоке расположен мировой финансовый центр Шанхай, силуэт которого формируют бесчисленные небоскребы.",
                "Англия, родина Шекспира и группы The Beatles, входит в состав Соединенного Королевства Великобритании и Северной Ирландии. Она расположена на Британских островах и граничит с Шотландией и Уэльсом. Столица Англии Лондон – современный многонациональный город на реке Темзе, деловой и культурный центр страны. Он получил всемирную известность благодаря зданию Парламента, башне Биг-Бен и крепости Тауэр XI века.",
                "Росси́я, или Росси́йская Федера́ция[e] (сокр. РФ[f]), — государство в Восточной Европе и Северной Азии. Россия — крупнейшее государство в мире, её территория в международно признанных границах составляет 17 098 246 км²[22].Перейти к разделу «#Географическое положение» Население страны в тех же границах, но включая территорию украинского Крыма, аннексия Россией которого[23][24] не получила международного признания, составляет 146 447 424[13] чел. (2023; 9-е место в мире).Перейти к разделу «#Численность населения, расселение»"

        };

        JMenuBar jMenuBar = new JMenuBar();
        JTextArea ta = new JTextArea(2, 3);
        ta.setText(infos[0]);
        ta.setMargin(new Insets(10,10,10,10));
        ta.setEditable(false);
        add(ta);

        ActionListener actionListener = e -> {
            JComboBox box = (JComboBox)e.getSource();
            String item = (String)box.getSelectedItem();
            if (item.equals(items[0])){
                ta.setText(infos[0]);
            }
            else if (item.equals(items[1])){
                ta.setText(infos[1]);
            }
            else if (item.equals(items[3])){
                ta.setText(infos[3]);
            }
            else if (item.equals(items[2])){
                ta.setText(infos[2]);
            }

        };

        JComboBox comboBox = new JComboBox(items);
        comboBox.addActionListener(actionListener);
        jMenuBar.add(comboBox);

        ta.setLineWrap(true);
        JScrollPane pane = new JScrollPane(ta);
        add(pane);
        setJMenuBar(jMenuBar);
        ta.setSize(20, 10);
        add(ta);





        setSize(new Dimension(340, 330));
        setVisible(true);

    }

    public static void main(String[] args) {
        new CountryInfo();
    }
}