package Less3;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");

        String[] string={"1","2","3","4","5"};

        ArrChenge<Object> arrChenge= new ArrChenge<>();
        arrChenge.swap(string,1,2);
        System.out.println(Arrays.asList(string));


        System.out.println("Задание 2");
        boolean result;// для выведения результата сравнения

        //создаем коробки

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox1= new Box<>();

        //Добавляем фрукты

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        orangeBox.addFruit(new Orange());

        // проверяем массу коробок

        System.out.println(" В корзине с яблоками " + appleBox.getTotalWeight() + " кг");
        System.out.println(" В корзине с апельсинами " + orangeBox.getTotalWeight() + " кг");

        // сравниваем коробки

        result = appleBox.compare(orangeBox);
        System.out.println(result);

        // Пересыпаем фрукты
        appleBox1.changeBox(appleBox);
        System.out.println(appleBox.getTotalWeight());



    }
}

