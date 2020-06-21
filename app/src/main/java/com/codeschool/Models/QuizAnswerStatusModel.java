
package com.codeschool.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import androidx.annotation.NonNull;

public class QuizAnswerStatusModel {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("endOfQuiz")
    @Expose
    private Boolean endOfQuiz;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsEndOfQuiz() {
        return endOfQuiz;
    }

    public void setIsEndOfQuiz(Boolean isEndOfQuiz) {
        this.endOfQuiz = isEndOfQuiz;
    }


    @NonNull
    @Override
    public String toString() {
        return "status: "+getStatus()+" endofquiz: "+getIsEndOfQuiz();
    }
}
