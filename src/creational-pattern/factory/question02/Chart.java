package factory.question02;

public abstract class Chart {
    private String chartName;
    public Chart(String chartName){
        this.chartName=chartName;
    }

    public String getChartName() {
        return chartName;
    }
}
