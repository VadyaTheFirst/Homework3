public class Main {
    public static void main(String[] args) {
        //Задача 1
        int a=129;
        System.out.println(a);
        byte b=90;
        System.out.println(b);
        short c= 1190;
        System.out.println(c);
        long d=567L;
        System.out.println(d);
        float g=129.3f;
        System.out.println(g);
        double q=56.1;
        System.out.println(q);

        //Задача 2
        g=27.12f;
        d=987678965549L;
        b=2;
        a=786;
        boolean i = false;
        short k=569;
        short j= -159;
        short u = 27896;
        double v = 67.;

        //Задача 3
        byte classLuda = 23;
        byte classAnya = 27;
        byte classKatya = 30;

        System.out.println("На каждого ученика рассчитано " + (480/(classAnya+classKatya+classLuda)) + " листов бумаги");

        //Задача 4
        byte proizv =16;
        byte time =2;
        int t =20;
        proizv = (byte) (proizv/time);

        System.out.println("За " + t +" минут " + " машины произвела бутылок " + proizv*t +" штук");
        t=60*12;
        System.out.println("За сутки " + " машины произвела бутылок " + proizv*t +" штук");
        t=t*3;
        System.out.println("За 3 дня " + " машины произвела бутылок " + proizv*t +" штук");
        t=t*10; //Берем месяц равный 30 дням для простоты
        System.out.println("За 1 месяц " + " машины произвела бутылок " + proizv*t +" штук, поланая, " +
                "что в месяце 30 дней");

        //Задача 5
        byte total=120;
        byte white=2;
        byte brown= 4;

        byte classes = (byte) (total / (brown+white));

        System.out.println("В школе, где " + classes +" классов, нужно " + white*classes +
                " банок белой краски и " + brown*classes + " банок коричневой краски");

        //Задача 6
        byte bananaWeight= 80;
        byte bananaCount=5;
        float Milk= 105/100f;
        Milk=Milk*200;
        byte iceCreamWeight = 100;
        byte iceCreamCount=2;
        byte eggWeight=80;
        byte eggCount=4;

        double breakfastTotal= (bananaWeight*bananaCount+Milk+iceCreamWeight*iceCreamCount+eggWeight*eggCount);
        breakfastTotal=breakfastTotal/1000;

        System.out.println("Масса завтрака = "  + breakfastTotal + " кг");

        //Задача 7
        int weighTotal = 7;
        float weightDay = 250/1000f;

        double dayTotal= weighTotal/weightDay;
        System.out.println("При ежедневном сбросе массы  "  + weightDay + " кг" +
                " спортсмен сбросит " + weighTotal + " кг за " + dayTotal  + " дней");

        weightDay = 500/1000f;
        dayTotal= weighTotal/weightDay;
        System.out.println("При ежедневном сбросе массы  "  + weightDay + " кг" +
                " спортсмен сбросит " + weighTotal + " кг за " + dayTotal  + " дней");

        // Задача 8
        int mashaSalary = 67760;
        int denSalary = 83690;
        int krisSalary=76230;

        var mashaSalaryNew = mashaSalary+mashaSalary*0.1;
        System.out.println("Маша теперь получает " + mashaSalaryNew +
                " рублей. Годовой доход вырос на " + (mashaSalaryNew-mashaSalary) +" рублей");

        var denSalaryNew = denSalary+denSalary*0.1;
        System.out.println("Денис теперь получает " + denSalaryNew +
                " рублей. Годовой доход вырос на " + (denSalaryNew-denSalary) +" рублей");

        var krisSalaryNew = krisSalary + krisSalary*0.1;
        System.out.println("Кристина теперь получает " + krisSalaryNew +
                " рублей. Годовой доход вырос на " + (krisSalaryNew-krisSalary) +" рублей");


    }
}