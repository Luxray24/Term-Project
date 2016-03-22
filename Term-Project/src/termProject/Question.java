/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Link to the site for randomising options: http://www.tutorialspoint.com/java/util/collections_shuffle.htm

package termProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Mark
 */
public class Question {

    ArrayList<String> questions = new ArrayList();
    String[] option1 = new String[2];
    String[] option2 = new String[2];
    String[] option3 = new String[2];
    String[] correctAnswer = new String[2];
    
    public Question(){
        setArrays();
    }

    public void setArrays() {
        try {
            InputStreamReader isr = new InputStreamReader(
                    this.getClass().getResourceAsStream("/data/questionBank.txt"));
            BufferedReader br = new BufferedReader(isr);
            for (int i = 0; i < 2; i++) {
                String comment = br.readLine();
                if (comment == null) {
                    break;
                }
                questions.add(br.readLine());
                option1[i] = br.readLine();
                option2[i] = br.readLine();
                option3[i] = br.readLine();
                correctAnswer[i] = br.readLine();
                if (i == 1) {
                    br.close();
                }
            }
        } catch (IOException e) {

        }
    }
}
