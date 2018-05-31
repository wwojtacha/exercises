package dataTypes;

/*
Napisz aplikację której zadaniem jest liczenie srednich ocen z kilku przedmiotów.
 - ocena_matematyka
 - ocena_chemia
 - ocena_j_polski
 - ocena_j_angielski
 - ocena_wos
 - ocena_informatyka

Aplikacja ma wyliczac średnią wszystkich ocen, srednią ocen z przedmiotów ścisłych (matematyka, chemia, informatyka),
oraz średnią z ocen przedmiotów humanistycznych (pozostałe).
- Wszystkie trzy średnie mają być wypisane na ekran. Zwróć uwagę na zaokrąglenia.
- Jeśli którakolwiek z ocen jest niedostateczna, lub średnia z ocen z którejś części jest niedostateczna,
to wyświetl napis:  Ocena z [część] jest niedostateczna.
 */

public class exercise8 {
    public static void main(String[] args) {

        double gradeMath = 3.0;
        double gradeChemistry = 2.0;
        double gradePolish = 4.5;
        double gradeEnglish = 5.0;
        double gradeWOS = 3.5;
        double gradeIT = 1.0;

        double averageAll = Math.round((gradeMath + gradeChemistry + gradePolish + gradeEnglish + gradeWOS + gradeIT) / 6);
        double averageScience = Math.round((gradeMath + gradeChemistry + gradeIT) / 3);
        double averageHuman = Math.round((gradePolish + gradeEnglish + gradeWOS) / 3);

        System.out.println("Total average: " + averageAll);
        System.out.println("Science average: " + averageScience);
        System.out.println("Humanistic average: " + averageHuman);

        double [] averages = new double [] {
                gradeMath,
                gradeChemistry,
                gradePolish,
                gradeEnglish,
                gradeWOS,
                gradeIT,
                averageAll,
                averageScience,
                averageHuman
        };

        String [] averagesName = new String [] {
                "Math",
                "Chemistry",
                "Polish",
                "English",
                "WOS",
                "IT",
                "General average",
                "Science average",
                "Humanistic average"
        };

    for (int i = 0; i < averages.length; i++){

        if (averages[i] == 1.0){
            System.out.println("Grade from " + averagesName[i] + " is 1.0!");
        }
    }

    }
}
