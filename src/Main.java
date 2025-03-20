public class Main {
    public static void main(String[] args) {
        int age1 = 8;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + " он cовершеннолетний");
        }else {
            System.out.println("Если возраст человека равен " + age1 + " он не достиг совершенолетия, " +
                    " нужно немного подождать");
        }
        int temperature1 = 13;
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 + " градуса, нужно надеть шапку");
        }else {
            System.out.println("На улице " + temperature1 + " градусов, можно идти без шапки");
        }


        int speed1 = 50;
        if (speed1 > 60){
            System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф");
        }else {
            System.out.println("Если скорость " + speed1 + ", то можно ездить спокойно ");
        }


        int kindergarten = 3;
        int school = 9;
        int university = 20;
        int work = 25;
        if (kindergarten >= 2 && kindergarten <= 6) {
            System.out.println("Если возраст человека равен " + kindergarten + ", то ему нужно ходить в дет сад");
        }
        if (school >= 7 && school <= 17){
            System.out.println("Если возраст человека равен " + school + ", то ему нужно ходить в школу");
        }
        if (university >= 18 && university <= 24){
            System.out.println("Если возраст человека равен " + university + ", то ему нужно ходить в университет");
        }
        if (work > 24){
            System.out.println("Если возраст человека равен " + work + ", то ему пора ходить на работу");
        }


        int baby = 4;
        int child = 8;
        int teenager = 15;
        if (baby < 5){
            System.out.println("Если возраст ребенка равен " + baby + ", то он не может кататся на аттракционе");
        }
        if (child > 5 && child < 14){
            System.out.println("Если возраст ребенка равен " + child + ", то он может кататся только в сопровождении" +
                    " взрослого. Если взрослого нет то кататся нельзя.");
        }
        if (teenager > 14){
            System.out.println("Если возраст ребенка равен " + teenager + ", то он может кататся без сопровождения " +
                    "взрослого ");
        }

        int seatNumber = 75;
        if (seatNumber <= 60) {
            System.out.println(" Есть сидячие места");
        }else {
            if (seatNumber > 60 && seatNumber <= 102) {
                System.out.println("Есть только стоячие места");
            } else {
                System.out.println("Мест в вагоне нет");
            }
        }


        int one = 5;
        int two = 9;
        int three =7;
        if (one > two && one > three){
            System.out.println("Первое число самое большое");
        }else if (two > one && two > three){
            System.out.println("Второе число самое большое");
        }else {
            System.out.println("Третье число самое большое");
        }









    }
}
