import chart.*;

public interface IFactory {
    public Legend createLegend();
    public Title createTitle();
    public List<Series> createSeries();
    public List<Xaxis> createXaxis();
	public void loadData(Object o);
}