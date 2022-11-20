import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2020;
        int clientOs = 1;
        int clientDeviceYear = 2000;
        int deliveryDistance = 95;

        task1(year);
        task2(clientOs,clientDeviceYear);
        System.out.println("Потребуется " + task3(deliveryDistance) + " дней");

    }
    public static void task1 (int year) {
        System.out.println("task 1 \n");
        String yearType;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            yearType = " - високосный год.";
            System.out.println(year + yearType);
        }
        else {
            yearType = " - не високосный год.";
            System.out.println(year + yearType);
        }
    }
    public static void task2 (int clientOs,int clientDeviceYear) {
        System.out.println("task 2 \n");
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear < currentYear) {
            if (clientOs ==0) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            }
        }
        else if (clientDeviceYear==currentYear){
            if (clientOs ==0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
        else {
            System.out.println("Вы ввели год больше текущего");
        }
    }
   public static int task3 (int deliveryDistance) {
       System.out.println("task 3\n");
       int oneDayDelivery = 20;
       int incDayDelivery = 40;
       int day;

       if (deliveryDistance <= oneDayDelivery) {
           day=1;
       }
       else {
           day = ((deliveryDistance - oneDayDelivery) / incDayDelivery) + 2;
       }
       return day;
   }
}