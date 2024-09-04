import CharChoice.CharSelect;

import java.util.Scanner;

public class Main extends CharSelect {
    Scanner input = new Scanner(System.in);

    public String choice;
    public String ans;
    
    public void answerChoice(String c) {
        this.choice = c;
    }
    
    public void mainGame() throws InterruptedException {
        System.out.println("Pokemon Test Game");
        Thread.sleep(1000);

        selChar();

        String answer = input.nextLine();
        
        answerChoice(answer);
        diffChoices();
        yesOrNo();
    }
    public void selChar() {
        System.out.println("Select character: ");
        System.out.println("A - Squirtle");
        System.out.println("B - Charmander");
        System.out.println("C - Bulbasaur");
        System.out.println("");
    }
    public void diffChoices() {
        switch(choice) {
            case "A":
                ans = "Squirtle";
                wordToString(ans);
                briefDesc();
                break;
            case "B":
                ans = "Charmander";
                wordToString(ans);
                briefDesc();
                break;
            case "C":
                ans = "Bulbasaur";
                wordToString(ans);
                briefDesc();
                break;
        }
    }
    public void yesOrNo() throws InterruptedException {
        System.out.println("Would you like to continue? Y/N");
        String yesNo = input.nextLine();
        if(yesNo.equals("Y")) {
            System.out.println("You have chosen your character: " + ans);
        }
        else {
            mainGame();
        }
    }
}
