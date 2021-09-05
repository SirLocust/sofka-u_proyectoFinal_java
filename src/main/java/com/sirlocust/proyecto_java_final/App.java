package com.sirlocust.proyecto_java_final;

import com.sirlocust.proyecto_java_final.model.exerciseThree.controller.ExerciseThreeController;
import com.sirlocust.proyecto_java_final.model.exerciseThree.model.CalculateAreaCircle;
import com.sirlocust.proyecto_java_final.model.exerciseThree.view.ExerciseThreeDashboard;

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
        CalculateAreaCircle calculateAreaCircle = new CalculateAreaCircle();
        ExerciseThreeDashboard exerciseThreeDashboard = new ExerciseThreeDashboard();
        ExerciseThreeController exerciseThreeController = new ExerciseThreeController(exerciseThreeDashboard,
                calculateAreaCircle);
        exerciseThreeController.init();
    }
}
