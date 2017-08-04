package com.dp.chart.factory;
import java.util.List;

import com.dp.chart.Legend;
import com.dp.chart.Series;
import com.dp.chart.Title;
import com.dp.chart.Xaxis;

public interface IFactory {
    public Legend createLegend();
    public Title createTitle();
    public List<Series> createSeries();
    public List<Xaxis> createXaxis();
}