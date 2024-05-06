public class ClassExample {
        // Fields
        private String name;
        private int age;
        private String rollNumber;
        
        // Constructor
        public ClassExample(String name, int age, String rollNumber) {
            this.name = name;
            this.age = age;
            this.rollNumber = rollNumber;
        }
        
        // Methods
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
        
        public String getRollNumber() {
            return rollNumber;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public void setAge(int age) {
            this.age = age;
        }
        
        public void setRollNumber(String rollNumber) {
            this.rollNumber = rollNumber;
        }
        public static void main(String[] args) {
            // Creating a new student object
            ClassExample student1 = new ClassExample("John Doe", 20, "2024001");
            
            // Accessing and modifying student information
            System.out.println("Name: " + student1.getName());
            System.out.println("Age: " + student1.getAge());
            System.out.println("Roll Number: " + student1.getRollNumber());
            
            // Modifying student information
            student1.setName("Jane Smith");
            student1.setAge(21);
            student1.setRollNumber("2024002");
            
            // Displaying modified information
            System.out.println("\nModified Information:");
            System.out.println("Name: " + student1.getName());
            System.out.println("Age: " + student1.getAge());
            System.out.println("Roll Number: " + student1.getRollNumber());
        }
    }
        

    