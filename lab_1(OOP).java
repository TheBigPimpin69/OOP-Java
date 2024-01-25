import java.util.Scanner;
class lab_1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine(); 
        //System.out.println("Hello " + name + ", welcome to the COSC1200 Class");

        System.out.println("What's your age?");
        String ageString = scanner.nextLine(); 

      
        int age = Integer.parseInt(ageString);

        if (age < 25){
            System.out.println("Hello " + name + ", welcome to the COSC1200 Class, you are very young.");
        }
        else if (age >= 25 && age < 45){
            System.out.println("Hello " + name + ", welcome to the COSC1200 Class, you still have hope.");
        }
        else if (age >= 45 && age <60){
            System.out.println("Hello " + name + ", welcome to the COSC1200 Class, VERY OLD");
        }
        else if (age > 60){ 
        System.out.println("Hello " + name + ", welcome to the COSC1200 Class, deaths door");
        }
        scanner.close(); 
    }
}

////////////branch