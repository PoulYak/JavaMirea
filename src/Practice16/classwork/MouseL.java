package Practice16.classwork;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//class MouseL implements MouseListener {
//    public void mouseClicked(MouseEvent event) {
//        if (loginField.getText().equals("Иван"))
//            JOptionPane.showMessageDialog(null, "Вход выполнен");
//        else
//            JOptionPane.showMessageDialog(null, "Вход НЕ выполнен");
//    }
//
//    public void mouseEntered(MouseEvent event) {
//    }
//
//    public void mouseExited(MouseEvent event) {
//    }
//
//    public void mousePressed(MouseEvent event) {
//    }
//
//    public void mouseReleased(MouseEvent event) {
//    }
//}


//АНОНИМНЫЙ КЛАСС
//
//ok.addMouseListener(new MouseL());заменитьна:ok.addMouseListener(new MouseListener(){
//public void mouseClicked(MouseEvent event){if
//        (loginField.getText().equals("Иван"))JOptionPane.showMessageDialog(null,"Вход выполнен");else JOptionPane.showMessageDialog(null,"Вход НЕ
//        выполнен");
//        }
//public void mouseEntered(MouseEvent event){}public void mouseExited(MouseEvent event){}public void mousePressed(MouseEvent event){}public void mouseReleased(MouseEvent event){}
//        });


//MouseAdapter

//Класс MouseAdapter реализует интерфейс MouseListener,определяя пустые реализации для каждого из его методов.Можно унаследовать своего слушателя от этого класса и переопределить теметоды,которые нам нужны.
//        В результате предыдущее описание слушателя будет выглядеть более компактно:
//        ok.addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent event){
//        if(loginField.getText().equals("Иван"))
//        JOptionPane.showMessageDialog(null,"Вход выполнен");else JOptionPane.showMessageDialog(null,"Вход НЕ
//        выполнен");
//        }
//        });

//ФокусListener
//
//Слушатель фокуса FocusListener
//        Слушатель FocusListener отслеживает моменты, когда объект получает фокус (то есть становится активным) или теряет его.
//        Концепция фокуса очень важна для оконных приложений. В каждый момент времени в окне может быть только один активный
//        (находящийся в фокусе) объект, который получает информацию о нажатых на клавиатуре клавишах (т.е. реагирует на
//        события клавиатуры), о прокрутке колесика мышки и т.д. Пользователь активирует один из элементов управления нажатием мышки или с помощью клавиши Tab (переключаясь между ними).

//Интерфейс FocusListener имеет два метода:
//public void focusGained(FocusEvent event) — вызывается, когда наблюдаемый объект получает фокус
//public void focusLost(FocusEvent event) — вызывается, когданаблюдаемый объект теряет фокус.

//MouseWheelListener

//Слушатель колеса манипулятора мыши MouseWheelListener
//        Слушатель MouseWheelListener оповещается при вращении
//        колесика мыши в тот момент, когда данный компонент находится в фокусе. Этот интерфейс содержит всего один метод:
//public void mouseWheelMoved(MouseWheelEvent event).

//KeyListener

//Слушатель клавиатуры KeyListener
//        Слушатель KeyListener оповещается, когда пользователь работает с клавиатурой в тот момент, когда данный компонент находится в фокусе. В интерфейсе определены методы:
//public void mouseKeyTyped(KeyEvent event) — вызывается, когда с клавиатуры вводится символ
//public void mouseKeyPressed(KeyEvent event) — вызывается,когда нажата клавиша клавиатуры
//public void mouseKeyReleased(KeyEvent event) — вызывается, когда отпущена клавиша клавиатуры.
//        Аргумент event этих методов способен дать весьма ценные сведения. В частности,
//        команда event.getKeyChar() возвращает символтипа char, связанный с нажатой клавишей. Если с нажатой клавишей не
//        связан никакой символ, возвращается константа CHAR_UNDEFINED. Команда event.getKeyCode() возвратит код нажатой
//        клавиши в виде целого числа типа int. Его можно сравнить с одной из многочисленных констант,
//        определенных в классе KeyEvent: VK_F1, VK_SHIFT, VK_D, VK_MINUS и т.д. Методы isAltDown(), isControlDown(), isShiftDown()
//        позволяют узнать, не была ли одновременно нажата одна из клавиш-модификаторов Alt, Ctrl или Shift.


// ChangeListener


//Слушатель изменения состояния ChangeListener
 //       Слушатель ChangeListener реагирует на изменение состояния объекта. Каждый элемент управления по-своему
//       определяет понятие «изменение состояния». Например, для панели со вкладками JTabbedPane это переход на другую
//       вкладку, для ползунка JSlider — изменение его положения, кнопка JButton рассматривает как смену состояния
//       щелчок на ней. Таким образом, хотя событие — это достаточно общее, необходимо уточнять его специфику для
//       каждогоконкретного компонента. В интерфейсе определен всего один метод:


//WindowListener

//Слушатель событий окна WindowListener
//        Слушатель WindowListener, может быть, привязан только к окну и оповещается о различных событиях, произошедших с окном:
//public void windowOpened(WindowEvent event) — окно открылось.
//public void windowClosing(WindowEvent event) — попытка закрытия окна (например, пользователя нажал на крестик). Слово «попытка» означает, что данный метод вызовется до того, как окно будет закрыто и может воспрепятствовать этому (например, вывести диалог типа «Вы уверены?» и отменить закрытие окна, если пользователь выберет «Нет»).
//public void windowClosed(WindowEvent event) — окно закрылось. public void windowIconified(WindowEvent event) — окно свернуто.
//public void windowDeiconified(WindowEvent event) — окноразвернуто. public void windowActivated(WindowEvent event) — окно сталоактивным. public void windowDeactivated(WindowEvent event) — окно стало
//        неактивным.

//СomponentListener

//Слушатель событий компонента СomponentListener
//        Слушатель ComponentListener оповещается, когда наблюдаемый визуальный компонент изменяет свое положение, размеры или видимость. В интерфейсе четыре метода:
//public void componentMoved(ComponentEvent event) — вызывается, когда наблюдаемый компонент перемещается (в результате вызова команды setLocation(), работы менеджера размещения или еще по какой-то причине).
//public void componentResized(ComponentEvent event) — вызывается, когда изменяются размеры наблюдаемого компонента.
//public void componentHidden(ComponentEvent event) —вызывается, когда компонент становится невидимым.
//public void componentShown(ComponentEvent event) —вызывается, когда компонент становится видимым.


//Слушатель выбора элемента ItemListener

//        Слушатель ItemListener реагирует на изменение
//        состояния одного из элементов, входящих в состав наблюдаемого компонента. Например, выпадающий список JComboBox
//        состоит из множества элементов, и слушатель реагирует, когда изменяется выбранный элемент. Также данный
//        слушатель оповещается при выборе либо отмене выбора флажка JCheckBox или переключателя JRadioButton, изменении
//        состояния кнопки JToggleButton и т.д. Слушатель обладаетодним методом:
//public void itemStateChanged(ItemEvent event).

//Универсальный слушатель ActionListener

//        Среди многочисленных событий, на которые реагирует каждый элемент управления (и о которых он оповещает соответствующих слушателей, если они к нему присоединены), есть одно основное, вытекающее из самой сути компонента и обрабатываемое значительно чаще, чем другие. Например, для кнопки это щелчок на ней, а для выпадающего списка — выбор нового элемента.
//        Для отслеживания и обработки такого события может быть использован особый слушатель ActionListener, имеющий один метод:
//public void actionPerformed(ActionEvent event).
//        У использования ActionListener есть небольшое преимущество в эффективности (так, при обработке нажатия на кнопку
//        не надо реагировать на четыре лишних события — ведь даже если методы- обработчики пустые, на вызов этих методов
//        все равно тратятся ресурсы). А кроме того, очень удобно запомнить и постоянно использовать один класс с одним
//        методам и обращаться к остальнымлишь
//        в тех относительно редких случаях, когда возникнет такая необходимость.