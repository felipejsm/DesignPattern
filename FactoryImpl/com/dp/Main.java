package com.dp;
import com.dp.chart.LineChart;
import com.dp.chart.factory.IFactory;
import com.dp.chart.factory.LineChartFactory;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new LineChartFactory();
        LineChart chart = new LineChart(factory);
        //System.out.println("LINE CHART "+chart.title.getText());
    }
}