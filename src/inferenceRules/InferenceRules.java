/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inferenceRules;

import FactsBaseController.DataBaseController;
import interfaces.KnowledgeInterface;
import java.util.Vector;

/**
 *
 * @author miller.barrera
 */
public class InferenceRules {

    public static int AGE;
    public static int HEIGHT;
    public static int WEIGHT;
    public static String SEX;
    public String mKnowledgeId;

    private static DataBaseController dbController;
    public KnowledgeInterface iKnowlegge;
    private Vector suggestedRoutineData;

    public InferenceRules(KnowledgeInterface iKnowledge) {

        dbController = DataBaseController.getInstance();
        suggestedRoutineData = new Vector();
        this.iKnowlegge = iKnowledge;
        getBaseKnowledgeId();
    }

    public void getBaseKnowledgeId() {
        Vector facts = dbController.getFacts();
        WEIGHT = Integer.parseInt(facts.get(0).toString());
        HEIGHT = Integer.parseInt(facts.get(1).toString());

        getDataFromKnowledgeBase();
    }

    public String getKnowledgeId(int token) {
        String stoken = "";
        switch (token) {
            case 1:
                stoken = "PI";
                break;
            case 2:
                stoken = "BP";
                break;
            case 3:
                stoken = "GM";
                break;
            default:
                stoken = "PI";
        }

        return stoken;
    }

    public String getDataFromKnowledgeBase() {

        if ((HEIGHT >= 156 && HEIGHT <= 160) && (WEIGHT >= 54 && WEIGHT <= 61)) {
            //PESO IDEAL   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);

        } else if ((HEIGHT >= 161 && HEIGHT <= 165) && (WEIGHT >= 56 && WEIGHT <= 64)) {
            //peso ideal peso   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);
        } else if ((HEIGHT >= 166 && HEIGHT <= 170) && (WEIGHT >= 59 && WEIGHT <= 67)) {
            //peso ideal peso   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);
        } else if ((HEIGHT >= 171 && HEIGHT <= 175) && (WEIGHT >= 62 && WEIGHT <= 70)) {
            //peso ideal peso   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);
        } else if ((HEIGHT >= 176 && HEIGHT <= 180) && (WEIGHT >= 60 && WEIGHT <= 72)) {
            //peso ideal peso   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);
        } else if ((HEIGHT >= 144 && HEIGHT <= 150) && (WEIGHT >= 56)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 150 && HEIGHT <= 155) && (WEIGHT >= 59)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 156 && HEIGHT <= 160) && (WEIGHT >= 61)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 161 && HEIGHT <= 165) && (WEIGHT >= 64)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 166 && HEIGHT <= 170) && (WEIGHT >= 67)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 171 && HEIGHT <= 175) && (WEIGHT >= 70)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 176 && HEIGHT <= 180) && (WEIGHT >= 72)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 176 && HEIGHT <= 180) && (WEIGHT >= 72)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 155 && HEIGHT <= 160) && (WEIGHT >= 50 && WEIGHT <= 56)) {
            //peso ideal peso   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);
        } else if ((HEIGHT >= 161 && HEIGHT <= 165) && (WEIGHT >= 53 && WEIGHT <= 60)) {
            //peso ideal peso   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);
        } else if ((HEIGHT >= 166 && HEIGHT <= 170) && (WEIGHT >= 56 && WEIGHT <= 63)) {
            //peso ideal peso   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);
        } else if ((HEIGHT >= 171 && HEIGHT <= 175) && (WEIGHT >= 60 && WEIGHT <= 67)) {
            //peso ideal peso   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);
        } else if ((HEIGHT >= 176 && HEIGHT <= 180) && (WEIGHT >= 63 && WEIGHT <= 71)) {
            //peso ideal peso   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);
        } else if ((HEIGHT >= 181 && HEIGHT <= 185) && (WEIGHT >= 67 && WEIGHT <= 75)) {
            //peso ideal peso   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);
        } else if ((HEIGHT >= 186 && HEIGHT <= 190) && (WEIGHT >= 71 && WEIGHT <= 78)) {
            //peso ideal peso   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);
        } else if ((HEIGHT >= 161 && HEIGHT <= 165) && (WEIGHT >= 56 && WEIGHT <= 64)) {
            //peso ideal peso   , Ir a rutina Mantenerse
            getSuggestedRoutineId(1);
        } else if ((HEIGHT >= 155 && HEIGHT <= 160) && (WEIGHT >= 57)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 155 && HEIGHT <= 161) && (WEIGHT >= 61)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 166 && HEIGHT <= 170) && (WEIGHT >= 64)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 171 && HEIGHT <= 175) && (WEIGHT >= 68)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 176 && HEIGHT <= 180) && (WEIGHT >= 71)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 181 && HEIGHT <= 185) && (WEIGHT >= 76)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 186 && HEIGHT <= 190) && (WEIGHT >= 79)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        } else if ((HEIGHT >= 171 && HEIGHT <= 175) && (WEIGHT >= 68)) {
            //sobre peso   , Ir a rutina bajar de peso
            getSuggestedRoutineId(2);
        }else{
            getSuggestedRoutineId(1);
        }

        return "";
    }

    public void getSuggestedRoutineId(int id) {
        mKnowledgeId = getKnowledgeId(id);
        suggestedRoutineData = dbController.getSuggestedRoutineId(mKnowledgeId);
        iKnowlegge.notifyInferenceId(suggestedRoutineData);
    }
}
