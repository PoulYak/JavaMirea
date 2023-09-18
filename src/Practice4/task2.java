package Practice4;

import java.util.Arrays;
//todo - доделать

enum Sizes{
    XXS(32){
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    }
    , XS(34), S(36), M(38), L(40);
    public String getDescription(){
        return "Взрослый размер";
    }
    private int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }
}

interface MenClothing{
    void dressMan(Clothes[] mass);
}

interface WomenClothing{
    void dressWoman(Clothes[] mass);
}

abstract class Clothes{
    private Sizes size;
    private double price;
    private String color;

    public Clothes(Sizes size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing{
    @Override
    public String toString() {
        return "TShirt{}";
    }

    public TShirt(Sizes size, double price, String color) {
        super(size, price, color);
    }


    @Override
    public void dressMan(Clothes[] mass) {

    }

    @Override
    public void dressWoman(Clothes[] mass) {

    }
}
class Pants extends Clothes implements MenClothing, WomenClothing{

    public Pants(Sizes size, double price, String color) {
        super(size, price, color);
    }


    @Override
    public void dressMan(Clothes[] mass) {

    }

    @Override
    public void dressWoman(Clothes[] mass) {

    }

    @Override
    public String toString() {
        return "Pants{}";
    }
}

class Skirt extends Clothes implements WomenClothing{

    public Skirt(Sizes size, double price, String color) {
        super(size, price, color);
    }


    @Override
    public void dressWoman(Clothes[] mass) {
        System.out.println();

    }

    @Override
    public String toString() {
        return "Skirt{}";
    }
}

class Tie extends Clothes implements MenClothing{
    @Override
    public String toString() {
        return "Tie{}";
    }

    public Tie(Sizes size, double price, String color) {
        super(size, price, color);
    }


    @Override
    public void dressMan(Clothes[] mass) {

    }
}


class Atelier implements MenClothing, WomenClothing{
    public static void main(String[] args) {
        Clothes[] mass = {new Tie(Sizes.XS,23.3, "red"), new Skirt(Sizes.XS, 21.1, "blue"),
                new TShirt(Sizes.L, 10.2, "black"), new Pants(Sizes.XS, 23.4, "white")};
        Atelier atelier = new Atelier();
        atelier.dressMan(mass);
        atelier.dressWoman(mass);

    }

    @Override
    public void dressMan(Clothes[] mass) {
        System.out.println("\nDress man:");
        for (int i=0; i<mass.length; i++){
            if (!(mass[i] instanceof Skirt))
                System.out.printf("  %1$s, size: %2$s, price: %3$5.2f, color: %4$s\n", mass[i], mass[i].getSize(), mass[i].getPrice(), mass[i].getColor());
        }
    }

    @Override
    public void dressWoman(Clothes[] mass) {
        System.out.println("\nDress woman:");
        for (int i=0; i<mass.length; i++){
            if (!(mass[i] instanceof Tie))
                System.out.printf("  %1$s, size: %2$s, price: %3$5.2f, color: %4$s\n", mass[i], mass[i].getSize(), mass[i].getPrice(), mass[i].getColor());
        }
    }
}


