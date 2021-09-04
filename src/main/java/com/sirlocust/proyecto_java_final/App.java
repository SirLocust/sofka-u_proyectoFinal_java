package com.sirlocust.proyecto_java_final;

import com.sirlocust.proyecto_java_final.model.exerciseOne.controller.ExerciseOneController;
import com.sirlocust.proyecto_java_final.model.exerciseOne.model.WhichIsGreater;
import com.sirlocust.proyecto_java_final.model.exerciseOne.view.ExerciseOneDashboard;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        WhichIsGreater whichIsGreater = new WhichIsGreater();
        ExerciseOneDashboard exerciseOneDashboard = new ExerciseOneDashboard();
        ExerciseOneController exerciseOneController = new ExerciseOneController(exerciseOneDashboard, whichIsGreater);
        exerciseOneController.init();
    }
}
