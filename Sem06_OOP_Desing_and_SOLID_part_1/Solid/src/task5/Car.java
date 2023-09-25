package task5;

/**
     * Класс для создания экземпляра автомобиля
     */
    public class Car {
        private iEngine engine;

        public Car(iEngine engine) {
            this.engine = engine;
        }

        public void start() {
            this.engine.start();
        }
    }