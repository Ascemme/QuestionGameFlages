package com.ascemme.questkarinf.model;

import java.util.ArrayList;
import java.util.Random;

public class Logic {
    String firstBtn;
    String secondBtn;
    String thirdBtn;
    String fourthBtn;
    String fifthBtn;
    String sixthBtn;
    int mode;
    int answerIndex;
    int imageValue;
    ListOfValues listOfValues = new ListOfValues();
    ArrayList<String> list = listOfValues.getAncwerValues();
    int [] images = listOfValues.getImages();
    public Logic(int mode) {
        this.mode = mode;
        randomBtn();
    }


    public String getFirstBtn() {
        return firstBtn;
    }

    public void setFirstBtn(String firstBtn) {
        this.firstBtn = firstBtn;
    }

    public String getSecondBtn() {
        return secondBtn;
    }

    public void setSecondBtn(String secondBtn) {
        this.secondBtn = secondBtn;
    }

    public String getThirdBtn() {
        return thirdBtn;
    }

    public void setThirdBtn(String thirdBtn) {
        this.thirdBtn = thirdBtn;
    }

    public String getFourthBtn() {
        return fourthBtn;
    }

    public void setFourthBtn(String fourthBtn) {
        this.fourthBtn = fourthBtn;
    }

    public String getFifthBtn() {
        return fifthBtn;
    }

    public void setFifthBtn(String fifthBtn) {
        this.fifthBtn = fifthBtn;
    }

    public String getSixthBtn() {
        return sixthBtn;
    }

    public void setSixthBtn(String sixthBtn) {
        this.sixthBtn = sixthBtn;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public int getAnswerIndex() {
        return answerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        this.answerIndex = answerIndex;
    }

    public int getImageValue() {
        return imageValue;
    }

    public void setImageValue(int imageValue) {
        this.imageValue = imageValue;
    }

    private void randomBtn(){
        Random rand = new Random();
        int image = rand.nextInt(10);
        int first = rand.nextInt(10);
        int second = rand.nextInt(10);
        int third = rand.nextInt(10);
        int fourth = rand.nextInt(10);
        int fifth = rand.nextInt(10);
        int sixth = rand.nextInt(10);
        int randomId = rand.nextInt(3);
        boolean firstBool = Boolean.FALSE;
        boolean secondBool = Boolean.FALSE;
        boolean thirdBool = Boolean.FALSE;
        firstBool = first != second || first != third || first != fourth || first != sixth;
        secondBool = second != first || second != third || second != fourth || second != sixth;
        thirdBool = third != second || first != third || third != fourth || third != sixth;
        boolean fourthBool = (fourth != second || first != third || first != fourth || fourth != sixth);
        boolean fifthBool = (fifth != second || fifth != third || fifth != fourth || fifth != sixth);
        boolean sixthBool = (sixth != second || sixth != third || sixth != fourth || first != sixth);
        logicEvent(1,first);
        logicEvent(2,second);
        logicEvent(3,third);
        logicEvent(4,fourth);
        logicEvent(5,fifth);
        logicEvent(6,sixth);
        answerIndex = randomId;
        switch (randomId){
            case 0:
                logicEvent(7,first);
                break;
            case 1:
                logicEvent(7,second);
                break;
            case 2:
                logicEvent(7,third);
                break;
            case 3:
                logicEvent(7,fourth);
                break;
        }



}
    private void logicEvent(int btn, int randomither){

        switch (btn){
            case 1:
                firstBtn = list.get(randomither);
                break;
            case 2:
                secondBtn = list.get(randomither);
                break;
            case 3:
                thirdBtn = list.get(randomither);
                break;
            case 4:
                fourthBtn = list.get(randomither);
                break;
            case 5:
                fifthBtn = list.get(randomither);
                break;
            case 6:
                sixthBtn = list.get(randomither);
                break;
            case 7:
                imageValue = images[randomither];
        }
    }

}
