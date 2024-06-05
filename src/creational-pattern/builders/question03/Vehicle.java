package builders.question03;

public class Vehicle {
    private String make;
    private Integer model;
    private String year;
    private String engine;
    private String others;

    private Vehicle(VehicleBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.engine = builder.engine;
        this.others = builder.others;
    }

    public String getMake() {
        return make;
    }

    public Integer getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public String getOthers() {
        return others;
    }

    public static class VehicleBuilder {
        private final String make;
        private Integer model;
        private String year;
        private String engine;
        private final String others;

        public VehicleBuilder(String name, String phone) {
            this.make = name;
            this.others = phone;
        }

        public VehicleBuilder model(Integer model) {
            this.model = model;
            return this;
        }

        public VehicleBuilder year(String year) {
            this.year = year;
            return this;
        }

        public VehicleBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
