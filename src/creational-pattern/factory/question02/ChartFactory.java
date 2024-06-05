package factory.question02;

public class ChartFactory {
    public static Chart createChart(String chartName){
        if (chartName.equalsIgnoreCase("line")){
            return new Line();
        }
        else if (chartName.equalsIgnoreCase("bar")){
            return new Bar();
        }
        else if (chartName.equalsIgnoreCase("Pie")){
            return new Pie();
        }
        return null;
    }
}
