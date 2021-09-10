package com.sirlocust.proyecto_java_final.controller;

import com.sirlocust.proyecto_java_final.model.exerciseEight.ExerciseEightRun;
import com.sirlocust.proyecto_java_final.model.exerciseEighteen.ExerciseEighteenRun;
import com.sirlocust.proyecto_java_final.model.exerciseEleven.ExerciseElevenRun;
import com.sirlocust.proyecto_java_final.model.exerciseFive.ExerciseFiveRun;
import com.sirlocust.proyecto_java_final.model.exerciseFour.ExerciseFourRun;
import com.sirlocust.proyecto_java_final.model.exerciseNine.ExerciseNineRun;
import com.sirlocust.proyecto_java_final.model.exerciseOne.ExerciseOneRun;
import com.sirlocust.proyecto_java_final.model.exerciseSeven.ExerciseSevenRun;
import com.sirlocust.proyecto_java_final.model.exerciseTen.ExerciseTenRun;
import com.sirlocust.proyecto_java_final.model.exerciseThree.ExerciseThreeRun;
import com.sirlocust.proyecto_java_final.view.Dashborad;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrincipalController {
  Dashborad dashborad;

  public void init() {

    boolean isRun = true;
    while (isRun) {
      this.dashborad.principalMenu();
      switch (this.dashborad.getNumber().intValue()) {
        case 1:
          ExerciseOneRun.run();
          break;
        case 3:
          ExerciseThreeRun.run();
          break;

        case 4:
          ExerciseFourRun.run();
          break;
        case 5:
          ExerciseFiveRun.run();
          break;
        case 7:
          ExerciseSevenRun.run();
          break;
        case 8:
          ExerciseEightRun.run();
          break;
        case 9:
          ExerciseNineRun.run();
          break;
        case 10:
          ExerciseTenRun.run();
          break;
        case 11:
          ExerciseElevenRun.run();
          break;
        case 12:
          break;
        case 13:
          break;
        case 14:
          break;
        case 15:
          break;
        case 16:
          break;
        case 17:
          break;
        case 18:
          ExerciseEighteenRun.run();
          break;
        case 19:
          isRun = false;
          break;

      }
    }
  }

}
