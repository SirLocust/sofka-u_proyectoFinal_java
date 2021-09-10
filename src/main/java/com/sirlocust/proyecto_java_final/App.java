package com.sirlocust.proyecto_java_final;

import com.sirlocust.proyecto_java_final.controller.PrincipalController;
import com.sirlocust.proyecto_java_final.model.exerciseThree.controller.ExerciseThreeController;
import com.sirlocust.proyecto_java_final.model.exerciseThree.model.CalculateAreaCircle;
import com.sirlocust.proyecto_java_final.model.exerciseThree.view.ExerciseThreeDashboard;
import com.sirlocust.proyecto_java_final.view.Dashborad;

public final class App {

    public static void main(String[] args) {
        Dashborad dashborad = new Dashborad();
        PrincipalController principalController = new PrincipalController(dashborad);
        principalController.init();
    }
}
