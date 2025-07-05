public class ZooEventPublisher {
    // Статический вложенный класс
    // он не имеет доступа к нестатическим членам внешнего класса
    private String eventSource = "Главная система зоопарка";
    public static class Event {
        private String description;
        private String type;

        public Event (String description, String type){
            this.description = description;
            this.type = type;
        }

        public void displayEvent() {
            System.out.println("--- СОБЫТИЕ ---");
            System.out.println(" Тип: " + type);
            System.out.println(" Описание: " + description);
//            System.out.println("Источник" + eventSource); // не
        }
    }
    public class EventLogger {
        public void logNewEvent(String decs, String type) {
            System.out.println("\n--- ЖУРНАЛ СОБЫТИЙ ---");
            System.out.println("Зарегистрировано новое событие от " + eventSource + ":");
            Event event = new Event(decs, type);
            event.displayEvent();
        }
    }
    public void publishEvent(String desc, String type) {
        EventLogger logger = new EventLogger();
        logger.logNewEvent(desc, type);
    }


}

