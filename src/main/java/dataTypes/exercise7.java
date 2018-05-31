package dataTypes;

/*
Rozwinięcie poprzedniego zadania:
a. Dopisz do poprzedniej aplikacji dodatkową zmienną - wiek.
Jeśli osoba jest młodsza niż 10 lat, lub starsza niż 80, to nie może wejść na kolejkę.
b. Dopisz/zmień do/w poprzedniej aplikacji - osoba może wejść na kolejkę jeśli jej wzrost jest od 150 do 220 cm wzrostu.
c. Dopisz deskryptywne wyjasnienia:
  i. Jesli osoba nie moze wejsc na kolejke, to wypisz na konsole odpowiedni komunikat dlaczego.
  ii. Jesli osoba nie moze wejsc z powodu wagi, to powinien sie wypisac komunikat ze nie moze wejsc bo przekracza limit wagowy
  iii. Jesli osoba nie moze wejsc z powodu wieku, to powinien sie wypisac            INNY komunikat o tym ze nie moze wejsc z powodu wieku
 */

public class exercise7 {

    public static void main(String[] args) {

        int weight = 70;
        int height = 140;
        int age = 12;

        if (age < 10) {
            System.out.println("Too young");
        } else if (age > 80){
            System.out.println("Too old");
        }

        if (height < 150) {
            System.out.println("Too low");
        } else if (height > 220){
            System.out.println("Too tall");
        }

        if (weight > 180 ){
            System.out.println("Too heavy");
        }

    }
}
