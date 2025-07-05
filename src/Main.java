public class Main {
    public static void main(String[] args) {
        // ООП:
//        Employee[] staff = new Employee[2];
//        staff[0] = new Zookeeper("Иван", 101);
//        staff[1] = new Veterinarian("Анна", 102);
//
//        System.out.println("\n ---- Сотрудники зоопарка ---");
//        for(Employee emp : staff) {
//            emp.displayInfo();
//            emp.perfomJob();
//            System.out.println("---");


        System.out.println("\n ---Тест вложенных классов---");
        ZooEventPublisher.Event emergency = new ZooEventPublisher.Event("Лев сбежал!", "СРОЧНОЕ");
        emergency.displayEvent();
        ZooEventPublisher mainPublisher = new ZooEventPublisher();

        ZooEventPublisher.EventLogger dailyLogger = mainPublisher.new EventLogger();
        dailyLogger.logNewEvent("Новый питомец прибыл в зоопарк.", "Прибытие");

        mainPublisher.publishEvent("Ежедневная уборка вальеров", "Рутина");

        System.out.println("\n ---Тестирование Анонимных классов---");
        PetAction feedingAction = new PetAction() {
            @Override
            public void perform() {
                System.out.println("Анонимное действие: Питомец получил свою еду");
            }
        };

        PetAction sleepingAction = new PetAction() {
            @Override
            public void perform() {
                System.out.println("Питомец сладко спит");
            }
        };
        feedingAction.perform();
        sleepingAction.perform();
    }
}
