package com.example.myapplication8;

public class Quiz {
    int image,opt1,opt2,opt3,correctans;

    public Quiz(int image, int opt1, int opt2, int opt3, int correctans) {
        this.image = image;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.correctans = correctans;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getOpt1() {
        return opt1;
    }

    public void setOpt1(int opt1) {
        this.opt1 = opt1;
    }

    public int getOpt2() {
        return opt2;
    }

    public void setOpt2(int opt2) {
        this.opt2 = opt2;
    }

    public int getOpt3() {
        return opt3;
    }

    public void setOpt3(int opt3) {
        this.opt3 = opt3;
    }

    public int getCorrectans() {
        return correctans;
    }

    public void setCorrectans(int correctans) {
        this.correctans = correctans;
    }
}
