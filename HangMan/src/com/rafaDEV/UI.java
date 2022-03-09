package com.rafaDEV;

import java.util.Scanner;

public class UI {
    final private Model model;

    public UI(Model m){
        model = m;
    }

    public void game(){
        Scanner scanner = new Scanner(System.in);
        String input;
        int attempts = 0;

        System.out.println(" __    __                                                                 \n" +
                           "/  |  /  |                                                                \n" +
                           "$$ |  $$ |  ______   _______    ______   _____  ____    ______   _______  \n" +
                           "$$ |__$$ | /      \\ /       \\  /      \\ /     \\/    \\  /      \\ /       \\ \n" +
                           "$$    $$ | $$$$$$  |$$$$$$$  |/$$$$$$  |$$$$$$ $$$$  | $$$$$$  |$$$$$$$  |\n" +
                           "$$$$$$$$ | /    $$ |$$ |  $$ |$$ |  $$ |$$ | $$ | $$ | /    $$ |$$ |  $$ |\n" +
                           "$$ |  $$ |/$$$$$$$ |$$ |  $$ |$$ \\__$$ |$$ | $$ | $$ |/$$$$$$$ |$$ |  $$ |\n" +
                           "$$ |  $$ |$$    $$ |$$ |  $$ |$$    $$ |$$ | $$ | $$ |$$    $$ |$$ |  $$ |\n" +
                           "$$/   $$/  $$$$$$$/ $$/   $$/  $$$$$$$ |$$/  $$/  $$/  $$$$$$$/ $$/   $$/ \n" +
                           "                              /  \\__$$ |                                  \n" +
                           "                              $$    $$/                                   \n" +
                           "                               $$$$$$/                                    \n" +
                           "\n");

        do{
            System.out.println(model.show());

            System.out.print("\nWhat's your guess: ");
            input = scanner.nextLine();

            System.out.println(model.game(input));

            System.out.println("Number of attempts: " + ++attempts);
        }while((!model.checkWinningConditions(input) && !model.checkWinningConditions(model.show().toString())) && attempts != 10);

        if(model.checkWinningConditions(model.show().toString())){
            System.out.println("Congrats on winning the game!");
        }

        System.out.println("\nThe word was " + model.getWord().toUpperCase());
    }
}
