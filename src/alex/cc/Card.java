package alex.cc;
import java.util.ArrayList;
import java.util.Collections;

public class Card {
    private ArrayList<Integer> list = new ArrayList<>();

    public Card(long newNumber){
        System.out.println("Your number is " + newNumber);
        String number = String.valueOf(newNumber);
        String[] numbers = number.split("");
        for (String a : numbers){
            list.add(Integer.parseInt(a));
        }
    }

    public boolean checkLength(){
        return (list.size() > 13 && list.size() < 20);
    }

    public boolean luhnTest(){
        int last = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        ArrayList<Integer> reversed = new ArrayList<>();
        Collections.reverse(list);
        int total = 0;
        for (int i = 0; i < list.size(); i++){
            if (i % 2 == 0){
                if ((list.get(i) * 2) >= 10){
                    int sum = 0;
                    int num = list.get(i) * 2;
                    sum = (num % 10) + 1;
                    total += sum;
                }
                else {
                    total += list.get(i) * 2;
                }
            }
            else {
                total += list.get(i);
            }
        }
        return last == (10 - (total % 10));
    }


}
