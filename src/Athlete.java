import java.io.Serializable;
import java.util.Locale;
import java.util.Scanner;

public class Athlete implements Comparable<Athlete>, Serializable {
    private String name;
    private Double result;

    Athlete(String s, double v) {
        this.name = s;
        this.result = v;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name  = name;
    }

    public Double getResult(){
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return String.format("%-12.30s  %5.2f", this.name, this.result);
    }

    @Override
    public int compareTo(Athlete other) {
//        if(this.result < other.result) return 1;
//        else if(this.result > other.result) return -1;
//        else return 0;
        return other.result.compareTo(this.result);
    }
}
