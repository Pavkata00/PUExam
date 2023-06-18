public class Main {
    public static void main(String[] args) {
        // Създаване на офиса
        Office office = Office.getInstance();

       //TODO Примерен код за ръчно тестване:

        // Приемане на заявки за пакети

        Package packOne = office.acceptRequest("България");
        System.out.println("Приемане на пратка!");
        System.out.println("Информация за пратката след обработката: ");
        System.out.println(packOne.getDescription() + packOne.getDestination());

        System.out.println("===================================================");

        Package packTwo = office.acceptRequest("Индия");
        System.out.println("Приемане на пратка!");
        System.out.println("Информация за пратката след обработката: ");
        System.out.println(packTwo.getDescription() + packTwo.getDestination());

    }
}