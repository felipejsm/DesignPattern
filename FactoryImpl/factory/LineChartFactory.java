import chart.factory.IFactory;
public class LineChartFactory implements IFactory{
    
    public Legend createLegend() {
        Legend legend = new Legend();
        String [] data = {"Coke","Diet Coke"}; 
        legend.setData(data);
        return data;
    }
    public Title createTitle() {
        Title title = new Title();
        String text = "Preferences";
        title.setText(text);
        return title;
    }
    public List<Series> createSeries() {
        List<Series> series = new ArrayList<>();
        //#1 serie
        Series serieCoke = new Series();

    }
    public List<Xaxis> createXaxis() {
        
    }
 }