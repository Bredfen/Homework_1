import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWorkMain {
    public static void main(String[] args) {
        // Задание 1
        Integer[] testIntArr = new Integer[2];

        testIntArr[0] = 5;
        testIntArr[1] = 20;

        System.out.println(Arrays.deepToString(testIntArr));
        swap(testIntArr, 0, 1);
        System.out.println(Arrays.deepToString(testIntArr));

        // Задание 2
        ArrayList<Integer> arrList = toArrayList(testIntArr);

        // Задание 3
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);

    }
    public static void swap(Object[] arr, int index1, int index2) {
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}
