package Bireysel;

public class Fatih_A_Task2 {
task2(4);
task2("Nilgun Hnm);
task2("Elif Hnm","TurgayBey")


    public static void main(String[] args) {
        System.out.println("Lets practice Method Overloading");
    }
    public static void task2(int numberOfTheTeamMembers){
        System.out.println("There are "+numberOfTheTeamMembers+ " in our team");
        System.out.println("Lets meet our team members");
    }
    public static void task2(String teamMember){
        System.out.println("One of the team member is "+ teamMember);
    }
    public static void task2(String teamMember2,String teamMember3){
        System.out.println("The other members of our team are "+teamMember2+" , and "+teamMember3);
        System.out.println("It is a pleasure to work together");
    }

}
