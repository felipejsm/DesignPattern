public class LineChart extends Chart {
    public IFactory factory;
    public LineChart(IFactory factory) {
        if(factory != null) {
            this.factory = factory;
            createChart();
        }

    }
    private void createChart() {
       legend = this.factory.createLegend();
       series = this.factory.createSeries();
       title  = this.factory.createTitle();
       xaxis  = this.factory.createXaxis();
    }
}