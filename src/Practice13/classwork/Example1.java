package Practice13.classwork;

public class Example1 {
    public static void main(String[] args) {
//        int length();       // возвращает длину String
//        boolean isEmpty()// то же что thisString.length == 0
        // сравнение
//        boolean equals(String another)
// НЕЛЬЗЯ использовать'==' или'!=' для сравнения объектов String в Java
//        boolean equalsIgnoreCase(String another)
//        int compareTo(String another)// возвращает 0 если эта строка совпадает с another; <0 если лексикографически меньше another; or >0 int compareToIgnoreCase(String another)
//        boolean startsWith(String another)
//        boolean startsWith(String another, int fromIndex) // поиск начинается с fromIndex
//        boolean endsWith(String another)
// поиск & индексирование
//        int indexOf(String search)
//        int indexOf(String search, int fromIndex)
//        int indexOf(int character)
//        int indexOf(int character, int fromIndex) //поиск вперед от fromIndex
//        int lastIndexOf(String search)
//        int lastIndexOf(String search, int fromIndex) //поиск назад от fromIndex
//        int lastIndexOf(int character)
//        int lastIndexOf(int character, int fromIndex)
// выделение char или части строки из String (подстрока)
//        char charAt(int index)
// позиция от 0 до (длина строки-1)
//        String substring(int fromIndex)
//        String substring(int fromIndex, int endIndex) // exclude endIndex
// создается новый String или char[] из исходного
//        (Strings не изменяются!)
//        String toLowerCase()
//преобразование к нижнему регистру
//        String toUpperCase()
//преобразование к верхнему регистру
//        String trim() создается новый String с помощью удаления пробелов спереди и сзади
//        String replace(char oldChar, char newChar) //создание нового String со старым перемещается посредством буфера newChar
//        String concat(String another) // то же самое как thisString + другое char[] toCharArray()
        // создается char[] из stringoldChar
//        void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        // копируется в массив назначения dst char[]
        /* статические методы для преобразования примитивов в String*/
//        static String ValueOf(type arg)
        // тип может быть примитивный или char[]
// статические методы дают форматированный String используя //спецификаторы форматирования
//        static String format(String formattingString, Object... args)
// так же как printf()
// регулярные выражения (JDK 1.4)
//        boolean matches(String regexe)
//        String replaceAll(String regexe, String replacement) String replaceAll(String regexe, String replacement) String[] split(String regexe)
// разделяет String используя regexe как разделитель, // возвращает массив String
//        String[] split(String regexe, int count)
// для подсчета количества раз только (count) Статический метод String.format()
    }
}
