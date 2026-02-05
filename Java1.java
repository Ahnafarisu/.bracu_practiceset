public class Main2 {
    public static void main(String[] args){
        //This java class is for data variables
        /*
        Variable= a varying value or information that acts accordingly to what it holds
        There are 2 types of variable-
         */
        //🔴Primitive  vs 🔵Reference
        //----------          ---------
        //int                 string
        //double              array
        //char                object
        //boolean
        // There are 2 ways to create a variable
        //1. First we declare the variable
        //2/ Then we assign a value within it
        int age = 20;
        //step 1- declared the age variable
        //step 2- assigned the value 20
        System.out.println(age);
        int age2 = 21;
        System.out.println("But realistically its " + age2);
        //We use "+" sign to print string and integer value at the same time
        double marks = 50.5;
        double gpa = 4; //double refers to values with decimals
        double money = 120.67;
                System.out.println(marks);
        System.out.println("I have only " + money + "Tk");
        System.out.println("I got GPA " + gpa);

        char initial = 'A'; //char refers to a single character
        char symbol = '!';
        System.out.println(initial);
        System.out.println("Since I got only " + gpa + ", I will only get " + money + "Tk");

        boolean isCSStudent = true;
        /*
        --Camelcase is a term referring to the situation where
        if the variable name takes up 2 words, we combine them and
        the first letter should be uppercase while any word after that should start with
        upper case.
        */
        boolean teacher = false;
        System.out.println(isCSStudent);
        //📌The usage of boolean is seen in else and else-if statements
        int course = 110;
        if(isCSStudent){
            System.out.println("Welcome to CSE" + course + symbol);
            //use of boolean and if statement
        }
        else{
            System.out.println("You are not welcome here");
        }





    }
}
