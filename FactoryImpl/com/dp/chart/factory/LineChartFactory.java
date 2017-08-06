package com.dp.chart.factory;
import java.util.ArrayList;
import java.util.List;

import com.dp.chart.Legend;
import com.dp.chart.Series;
import com.dp.chart.Title;
import com.dp.chart.Type;
import com.dp.chart.Xaxis;

public class LineChartFactory implements IFactory{
    
    public Legend createLegend() {
        Legend legend = new Legend();
        String [] data = {"Lula","Bolsonaro","Aécio"}; 
        legend.setData(data);
        return legend;
    }
    public Title createTitle() {
        Title title = new Title();
        String text = "Brasil Polls";
        title.setText(text);
        return title;
    }
    public List<Series> createSeries() {
        List<Series> series = new ArrayList<>();
        //#1 serie
        Series seriePresidentCandidate = new Series();
        seriePresidentCandidate.setName("Lula");
        Object[] dataPresident1 = {5, 20, 36, 10, 10, 20,30,40,50,60,70,80};
        seriePresidentCandidate.setData(dataPresident1);
        seriePresidentCandidate.setType(Type.LINE);

        //#2 serie
        Series seriePresidentCandidate2 = new Series();
        seriePresidentCandidate2.setName("Bolsonaro");
        Object[] dataPresident2 = {15, 25, 38, 1, 17, 2,60, 80, 15, 25, 17, 59};
        seriePresidentCandidate2.setData(dataPresident2);
        seriePresidentCandidate2.setType(Type.LINE);

        //#3 serie
        Series seriePresidentCandidate3 = new Series();
        seriePresidentCandidate3.setName("Aécio");
        Object[] dataPresident3 = {52, 2, 3, 50, 12, 12, 17, 80, 90, 16, 76, 79};
        seriePresidentCandidate3.setData(dataPresident3);
        seriePresidentCandidate3.setType(Type.LINE);

        //Filling the list
        series.add(seriePresidentCandidate);
        series.add(seriePresidentCandidate2);
        series.add(seriePresidentCandidate3);

        return series;
    }
    public List<Xaxis> createXaxis() {
        List<Xaxis> xaxisList = new ArrayList<>();
        Xaxis xaxis = new Xaxis();
        String[] data = {"Jan","Fev","March","April","May","Jun",
                        "Jul","Aug","Sep","Oct","Nov","Dec"};
        xaxis.setData(data);
        return xaxisList;
    }
 }