/*Створити клас, який представляє навчальний клас ClassRoom.
Створіть клас учень Pupil.
У тілі класу створіть методи void study(), void read(), void write(), void relax().
Створіть 3 похідні класу ExcellentPupil, GoodPupil, BadPupil від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня.
Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів.
Передбачте можливість, що користувач може передати 2 або 3 аргументи.
Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.
 */

public class Main {
    public static void main(String[] args) {
        ExcellentPupil excellent = new ExcellentPupil();
        GoodPupil good = new GoodPupil();
        BadPupil loser = new BadPupil();

           ClassRoom classRoom = new ClassRoom(excellent, good, loser, excellent);

        System.out.println("ClassRoom");

        int count = 1;
           for (Pupil a : classRoom.arrPupil) {
               System.out.print("Pupil" + count + ":");
               a.study();
               a.read();
               a.write();
               a.relax();
               count++;
           }

           ClassRoom classRoom3 = new ClassRoom(excellent, good, loser);

        System.out.println("\nClassRoom3");
        count = 1;
           for (Pupil a : classRoom3.arrPupil) {
               System.out.print("Pupil" + count + ":");
               a.study();
               a.read();
               a.write();
               a.relax();
               a.info();
               count++;
           }

           ClassRoom classRoom2 = new ClassRoom(excellent, good);

        System.out.println("\nClassRoom2");
        count = 1;
           for (Pupil a : classRoom2.arrPupil) {
               System.out.print("Pupil" + count + ":");
               a.study();
               a.read();
               a.write();
               a.relax();
               a.info();
               count++;
           }

    }



            
}






