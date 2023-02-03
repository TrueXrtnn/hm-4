public class Main {
    public static void main (String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
            int clientOC=1;
            int clientDeviceYear = 2015;
            if (clientOC==1) {
                System.out.println("Установите приложение для Android по ссылке ");
            } else if (clientOC==0){
                System.out.println(" Установите приложение для iOS по ссылке");
            }
        }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOC=1;
        int clientDeviceYear = 2015;
        switch (clientOC) {
            case 1:
                 if (clientDeviceYear<2015) {
                     System.out.println("Установите облегченное приложение для Android по ссылке ");
                 } else System.out.println("Установите приложение для Android по ссылке");
                 break;
            case 0:
                if (clientDeviceYear<2015) {
                    System.out.println("Установите облегченное приложение для iOS по ссылке ");
                } else System.out.println("Установите приложение для iOS по ссылке");
                break;
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 800;
    if (year % 4 != 0 || year%100==0 ) {
            if (year % 400!=0){
            System.out.println(year+" год не является високосным ");
        } else  System.out.println(year+" год является високосным ");
         }
        else System.out.println(year+" год является високосным ");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 90;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется один день");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется два дня");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется три дня");
        } else System.out.println("Доставки нет");
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 10;
        switch (monthNumber){
            case 1:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Принадлежит к сезону зима");
                break;
            default:System.out.println("Неверный номер месяца");
        }
       }
    }



