package Practice4;


import java.util.*;

class Good {
    private String cat;
    private String name;
    private double price;

    public String getCat() {
        return cat;
    }


    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public Good(String cat, String name, double price) {
        this.cat = cat;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class InternetShop {
    public boolean isAuth() {
        return isAuth;
    }

    public void exec_command(String command, Scanner sc){
        if (command.equals("auth")){
            String login = sc.next();
            String pass = sc.next();

            if (!this.password.equals(pass) || !this.login.equals(login)){
                System.out.println("Autharization fail");
            }
            else{
                isAuth=true;
                System.out.println("Autharization success");
            }
        } else if (isAuth) {
            if (command.equals("catalog")){
                print_catalog();
            } else if (command.equals("basket")) {
                lookbasket();
            } else if (command.equals("buy")) {
                this.buy();

            } else if (command.equals("cat")) {
                String cat = sc.next();
                print_goods(cat);
            } else if (command.equals("addgood")){
                String cat = sc.next();
                int number_of_good = sc.nextInt();
                this.toBasket(cat, number_of_good);
            }
            else{
                System.out.println("Команды "+command+" не существует");
            }

        }
        else{
            System.out.println("Вы не авторизированы");
        }
    }


    public void print_catalog(){
        ArrayList<String> catalog = this.getCatalog();
        String cat = "";
        for (int i =0; i<catalog.size(); i++){
            cat += String.format("%1$d) %2$s\n", i+1, catalog.get(i));
        }
        System.out.println(cat);

    }

    public void print_goods(String cat){
        System.out.println(cat);
        ArrayList<Good> goods = this.getGoods(cat);
        for (int i=0; i<goods.size(); i++){
            Good good = goods.get(i);
            System.out.println(String.format("%1$d) %2$s - %3$.1fруб.", i+1, good.getName(), good.getPrice()));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String instruction =
                """
                auth <логин> <пароль> - авторизация +
                catalog - показать каталог +
                cat <каталог> - просмотр списка товаров определенного каталога +
                addgood <каталог> <номер товара> - добавить товар в корзину +
                basket - посмотреть корзину +
                buy - купить товары в корзине +
                """;

        System.out.println(instruction);

        Scanner sc = new Scanner(System.in);
        InternetShop shop = new InternetShop();
        shop.addGood(new Good("Бакалея", "Макароны", 12.5));
        shop.addGood(new Good("Бакалея", "Рис", 15.9));
        shop.addGood(new Good("Бакалея", "Булгур", 13.9));
        shop.addGood(new Good("Бакалея", "Пшено", 10.3));
        shop.addGood(new Good("Хлебобулочные", "Круассан", 5.3));
        shop.addGood(new Good("Хлебобулочные", "Хлеб", 2.3));
        shop.addGood(new Good("Хлебобулочные", "Лаваш", 3.3));
        shop.addGood(new Good("Хлебобулочные", "Батон", 5.6));
        shop.addGood(new Good("Сладости", "Мороженое", 15.3));
        shop.addGood(new Good("Сладости", "Шоколадка", 19.3));
        shop.addGood(new Good("Сладости", "Шоколадная паста",  50.3));
        shop.addGood(new Good("Сладости", "Печенье",  10.3));
        shop.addGood(new Good("Молочное", "Молоко",  23.3));
        shop.addGood(new Good("Молочное", "Сметана",  22.3));
        shop.addGood(new Good("Молочное", "Творог",  33.3));
        shop.addGood(new Good("Молочное", "Йогурт",  25.4));


        String command;
        while (true){
            command = sc.next();
            shop.exec_command(command, sc);
        }
//        shop.exec_command("auth", sc);
//        shop.exec_command("catalog", sc);
//        shop.exec_command("cat", sc);
//        shop.exec_command("addgood", sc);
//        shop.exec_command("basket", sc);
//        shop.exec_command("cat", sc);
//        shop.auth("321", "123");


//
//        shop.lookbasket();


    }

    public void lookbasket(){
        double s = 0;
        System.out.println("Корзина");
        for (int i=0; i<basket.size(); i++){
            Good good = basket.get(i);
            System.out.println(String.format("%1$d) %2$s - %3$.1fруб.", i+1, good.getName(), good.getPrice()));
            s+=good.getPrice();
        }
        System.out.println("Итого: "+s+"руб.");
    }
    public void buy(){
        double s = 0;

        for (int i=0; i<basket.size(); i++){
            s+=basket.get(i).getPrice();
        }
        System.out.println("Куплено на сумму: "+s+"руб.");
        basket.clear();

    }



    private final String password = "123";
    private final String login = "321";
    private boolean isAuth;
    private ArrayList<Good> basket;
    private ArrayList<Good> goods;
    public ArrayList<String> getCatalog(){


        HashSet<String> set = new HashSet<>();
        for (Good g: goods){
            set.add(g.getCat());
        }

        return new ArrayList<>(set);
    }
    public void toBasket(String cat, int goodnumber){
        try{
            basket.add(getGoods(cat).get(goodnumber-1));
            System.out.println("Товар успешно добавлен");
        } catch (Exception e){
            System.out.println("Такого товара нет");
        }

    }
    public ArrayList<Good> getGoods(String cat){
        ArrayList<Good> set = new ArrayList<>();
        for (Good g: goods){
            if (g.getCat().equals(cat))
                set.add(g);
        }

        return set;
    }
    private void addGood(Good good){
        goods.add(good);
    }
    public InternetShop() {
        isAuth = false;
        basket = new ArrayList<>();
        goods = new ArrayList<>();

    }

    public boolean auth(String login, String password){
        if (login.equals(this.login) && password.equals(this.password))
            isAuth=true;
        return isAuth;
    }




}
