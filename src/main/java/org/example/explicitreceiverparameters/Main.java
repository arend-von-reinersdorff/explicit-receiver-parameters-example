package org.example.explicitreceiverparameters;

public class Main {
    public void emptyIfBlock() {
        if (true) {
        }
    }

    // =======================================================
    // Demo Block - demonstrates explicit receiver parameters
    // =======================================================
    public void print(Main this) {
        System.out.println(this);
    }

    class Inner {
        Inner(Main Main.this) {
        }
    }
    // =======================================================
    // End of Demo Block
    // =======================================================
}
