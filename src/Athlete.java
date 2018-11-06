public class Athlete implements Comparable<Athlete>{
    String name;
    double result = 0;

    public Athlete(String s, double v) {
        this.name = s;
        this.result = v;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name  = name;
    }

    public double getResult(){
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return String.format("%s\t%5.2f", this.name, this.result);
    }

    @Override
    public int compareTo(Athlete other) {
//        if(this.result < other.result) return 1;
//        else if(this.result > other.result) return -1;
//        else return 0;
        return other.result.compareTo(this.result);
    }
}
