package builders.question02;

public class Person {
    private String name;
    private Integer age;
    private String email;
    private String address;
    private String phone;

    private Person(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static class UserBuilder {
        private final String name;
        private Integer age;
        private String email;
        private String address;
        private final String phone;

        public UserBuilder(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
