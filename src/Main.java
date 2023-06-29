import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {


        Cow[] cows = {
                new Cow(145, 2, "feminine", "Vdova"),
                new Cow(200, 4, "masculine", "Killer"),
                new Cow(160, 3, "feminine", "Muleni"),
                new Cow(190, 2, "masculine", "Ferdinant"),
                new Cow(156, 3,"feminine","Tika Taka"),};




        Hourse[]hourses= {
                new Hourse(200, 3, "masculine", "Mustang"),
        new Hourse(200, 3, "masculine", "Mustang"),};


        Sheep []sheeps={
              new Sheep(120,2,"gisar","Titan"),
              new Sheep(120,2,"gisar","Silach"),
              new Sheep(120,2,"gisar","Gerakl"),};


        Farm farm= new Farm("Burdg Halif"," Sheyh", cows, hourses,sheeps);
        System.out.println( farm);


        Cow []cows1= {
            new Cow(170, 2, "masculine", "Black Byk"),};


           Hourse[]hourses1={
                   new Hourse(230,3,"masculine","Kashka"),};

          Sheep[]sheep={
                  new Sheep(100,2,"masculine","Sary"),};

          Farm1 farm1=new Farm1("Putin", "Krasnyi Ploshad", cows1,hourses1,sheep);
        System.out.println(farm1);
           }
    }