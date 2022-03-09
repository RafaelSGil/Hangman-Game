package com.rafaDEV;

public class HangMan {
    public static void main(String[] args) {
        Model model = new Model();
        UI ui = new UI(model);
        ui.game();
    }

}
