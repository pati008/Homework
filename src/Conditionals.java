public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall=new Conditionals();

    }// main method
    public Conditionals(){
        String Question= "Am I gonna get straight A's?";
        System.out.println(Question);
        int randomInt= (int)(Math.random()*10);


        if (randomInt==1){
            System.out.println("Obviously");

        }
        if(randomInt==2){
            System.out.println("No");
        }
        if(randomInt==3){
            System.out.println("Yes");
        }

        if(randomInt==4){
            System.out.println("You could never!");
        }

        if(randomInt==5){
            System.out.println("We shall see...");
        }
        if(randomInt==6){
            System.out.println("Absolouley not");
        }

        if(randomInt==7){
            System.out.println("I can't tell right now");
        }

        if(randomInt==8){
            System.out.println("Maybe...");
        }
        if(randomInt==9){
            System.out.println("Of course!");
        }
        if(randomInt==10){
            System.out.println("By all means!");
        }



    }//constructor method
}
