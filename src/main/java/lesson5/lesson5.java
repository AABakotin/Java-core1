package lesson5;

public class lesson5 {
    public static void main(String[] args) {
        Sotrudnik sotrudnik = new Sotrudnik("Ivan", "Ivanov", "Ivanovich", "123@gmail.com",
                "prorab", 1980, 89776665511l, 50000);
        sotrudnik.printInfo();

        Sotrudnik[] persArray = new Sotrudnik[5];
        persArray[0] = new Sotrudnik("Maksim", "Msksimov", "Maksimovich", "222@mail.ru", "rab", 1988, 89556554210l, 20000);
        persArray[1] = new Sotrudnik("Sanya", "Alexandrov", "alexandrovich", "2232@mail.ru", "rab", 1990, 87856554210l, 40000);
        persArray[2] = new Sotrudnik("Kolya", "Kolyanov", "Kolyanovich", "2342@mail.ru", "prorab", 1978, 89556454210l, 60000);
        persArray[3] = new Sotrudnik("Anton", "Antonov", "Antonovich", "eff2@mail.ru", "tehnik", 1999, 89554584210l, 50000);
        persArray[4] = new Sotrudnik("Dima", "Dimov", "Dimonovich", "demon@mail.ru", "tehnik", 1970, 89578454210l, 50000);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40)
                persArray[i].printInfo();
        }
    }

}







