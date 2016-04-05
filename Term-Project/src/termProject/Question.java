/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package termProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Mark Swarner, Georgia Snelling
 */
public class Question {

    private int questionNumber;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctAnswer;
    private String wrongMessage;
    private String correctMessage;
    
    
    public Question(int questionNumber, String question, String option1, String option2, String option3, String option4, String correctAnswer, String wrongMessage, String correctMessage) 
    {
        this.questionNumber = questionNumber;
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctAnswer = correctAnswer;
        this.wrongMessage = wrongMessage;
        this.correctMessage = correctMessage;
        
    }

    public int getQuestionNumber()
    {
        return questionNumber;
    }
    
    public String getQuestion()
    {
        return question;
    }
    
    public String getOption1()
    {
        return option1;
    }
    
    public String getOption2()
    {
        return option2;
    }
    
    public String getOption3()
    {
        return option3;
    }
    
    public String getOption4()
    {
        return option4;
    }
 
    public String getCorrectAnswer()
    {
        return correctAnswer;
    }
    
    public String getWrongMessage()
    {
        return wrongMessage;
    }
    
    public String getCorrectMessage()
    {
        return correctMessage;
    }
    
    
}
