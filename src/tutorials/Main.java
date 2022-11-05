package tutorials;

import javax.swing.text.View;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void goWalk(int personAge, int temperature) {

        if(personAge > 20 && personAge < 45 && temperature > -20 && temperature < 30){
            System.out.println("Можно идти гуляять");
        }else if(personAge < 20 && (temperature > 0 && temperature < 28) ){
            System.out.println("Можно идти гулять");
        }else if(personAge > 45 && (temperature > -10 && temperature < 25)){
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Остовайтесь дома");
        }
    }
    public static void main(String[] args) {
        goWalk(44,12);
        goWalk(50,20);
        goWalk(35,10);
        goWalk(10,-25);
        goWalk(25,12);

    }
    }

