package com.delloil.quizzical;

public class QuestionModel {
    private  int answerID;
    private boolean annswerResult;


    public QuestionModel(int answerID, boolean annswerResult) {
        this.answerID = answerID;
        this.annswerResult = annswerResult;
    }

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public boolean isAnnswerResult() {
        return annswerResult;
    }

    public void setAnnswerResult(boolean annswerResult) {
        this.annswerResult = annswerResult;
    }
}
