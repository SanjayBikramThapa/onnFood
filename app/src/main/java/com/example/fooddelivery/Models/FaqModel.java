package com.example.fooddelivery.Models;

public class FaqModel {
    private String Question;
    private String Answer;

    FaqModel(){

    }
    public FaqModel(String Question, String Answer ){
        this.Question = Question;
        this.Answer = Answer;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }
}
