package dataTypes;

/*
Zadeklaruj dwie zmienne - 'waga' oraz 'wzrost'. Przypisz do nich jakieś wartości.
Stwórz instrukcję warunkową ('if'),
który sprawdza czy osoba (np. taka która na kolejkę/rollercoaster) jest wyższa niż 150 cm wzrostu i nie przekracza wagą 180 kg.
 */

public class exercise6 {
    public static void main(String[] args) {

        int weight = 70;
        int height = 140;

        if (height > 150 && weight < 180){
            System.out.println("You can enter");
        } else {
            System.out.println("You cannot enter");
        }

    }
}
