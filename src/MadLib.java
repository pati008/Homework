public class MadLib {
    public static void main(String[] args) {
        new MadLib();
    }



    public MadLib() {                              // constructor
            System.out.println("hello world");
            String classmate = "Greg";
            String city= "Chicago";
            String noun="fish";
            String adjective="pretty";
            String pluralNoun= "teachers";
            String pluralAnimal= "geese";
            boolean trueOrFalse= true;
            double decimalBiggerThan1= 1.01;
            int number1=5;
            int number2=10;
            int wholeNumberBetween1And4=3;
            String miltonTeacher="Mx. Bradford";
            String miltonDean= "Mr.Ruiz ";
            String letterGrade= "A";
            String season="spring";
            String story= "This weekend I am going camping with "
                    +classmate+ ". We are going to a campsite in "
                    +city+ ". I packed my "+noun+ " and "
                    +pluralNoun + ".  The forecast is calling for a high of "
                    +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                    +adjective+" day! This year, the park rangers have seen "
                    +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                    +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                    +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                    +miltonDean+ " said it actually has only happened "
                    + number2+" times. Wish us luck! If we survive, we will earn a "
                    +letterGrade+ "- in P.E. class.";

        System.out.println(story);



    }

}
