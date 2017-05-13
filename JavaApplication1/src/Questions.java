
import java.io.Serializable;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZiksMS
 */
public class Questions implements Serializable{
    // class instance variables
    private String question;
    private String answer;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswerNumber;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getCorrectAnswerNumber() {
        return correctAnswerNumber;
    }

    public void setCorrectAnswerNumber(String correctAnswerNumber) {
        this.correctAnswerNumber = correctAnswerNumber;
    }

    public Questions() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.question);
        hash = 43 * hash + Objects.hashCode(this.answer);
        hash = 43 * hash + Objects.hashCode(this.answer1);
        hash = 43 * hash + Objects.hashCode(this.answer2);
        hash = 43 * hash + Objects.hashCode(this.answer3);
        hash = 43 * hash + Objects.hashCode(this.answer4);
        hash = 43 * hash + Objects.hashCode(this.correctAnswerNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Questions other = (Questions) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.answer1, other.answer1)) {
            return false;
        }
        if (!Objects.equals(this.answer2, other.answer2)) {
            return false;
        }
        if (!Objects.equals(this.answer3, other.answer3)) {
            return false;
        }
        if (!Objects.equals(this.answer4, other.answer4)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswerNumber, other.correctAnswerNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Questions{" + "question=" + question + ", answer=" + answer + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", correctAnswerNumber=" + correctAnswerNumber + '}';
    }
    
    
    
    
    
}
