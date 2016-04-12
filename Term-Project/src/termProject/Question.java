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

    //All the factors of the Quiz JFrame/objects
    private int questionNumber;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctAnswer;
    private String wrongMessage;
    private String correctMessage;
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    
    //Constructor of class, makes each object
    //Sets each private variable with the matching parameter
    public Question(int questionNumber, String question, String option1, String option2, String option3, String option4, String correctAnswer, String wrongMessage, String correctMessage, String image1, String image2, String image3, String image4) 
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
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
        
    }

    /**
     * Gets the question number for the current question
     * @return the questionNumber
     */
    public int getQuestionNumber()
    {
        return questionNumber;
    }
    
    /**
     * Gets the actual question for the current question
     * @return the question
     */
    public String getQuestion()
    {
        return question;
    }
    
    /**
     * Gets option1 for the current question
     * @return option1
     */
    public String getOption1()
    {
        return option1;
    }
    
    /**
     * Gets option2 for the current question
     * @return option2
     */
    public String getOption2()
    {
        return option2;
    }
    
    /**
     * Gets option3 for the current question
     * @return option3
     */
    public String getOption3()
    {
        return option3;
    }
    
    /**
     * Gets option4 for the current question
     * @return option4
     */
    public String getOption4()
    {
        return option4;
    }
 
    /**
     * Gets the correct answer for the current question
     * @return correct answer
     */
    public String getCorrectAnswer()
    {
        return correctAnswer;
    }
    
    /**
     * Gets the wrong option chosen message for the current question
     * @return wrong message
     */
    public String getWrongMessage()
    {
        return wrongMessage;
    }
    
    /**
     * Gets the correct option chosen message for the current question
     * @return correct message
     */
    public String getCorrectMessage()
    {
        return correctMessage;
    }
    
    /**
     * Gets the Image name for option 1 for the current question
     * @return image1 name
     */
    public String getImage1Name()
    {
        return image1;
    }
    
    /**
     * Gets the Image name for option 2 for the current question
     * @return image2 name
     */
    public String getImage2Name()
    {
        return image2;
    }
    
    /**
     * Gets the Image name for option 3 for the current question
     * @return image3 name
     */
    public String getImage3Name()
    {
        return image3;
    }
    
    /**
     * Gets the Image name for option 4 for the current question
     * @return image4 name
     */
    public String getImage4Name()
    {
        return image4;
    }
    
    
}
