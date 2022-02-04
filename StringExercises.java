public class StringExercises { 
    public static void main(String[] args){ 
        String greeting = "Hello"; 
        String txt = "Hello"; 
        //print length of variable text
        System.out.println(txt.length()); 
        //convert variable text to all UpperCase 
        System.out.println(txt.toUpperCase()); 

        //concatenate two strings 
        String firstName = "John " ;
        String lastName = "Doe" ;
        System.out.println(firstName + lastName); 

        //use the correct method to concatenate two strings 
        System.out.println(firstName.concat(lastName)); 

        //return the index of the first occurence of e in the below string 
        String greetAll = "Hello Everybody"; 
        System.out.println(greetAll.indexOf("e"));


    }
}