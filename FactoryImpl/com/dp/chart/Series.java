package com.dp.chart;
import com.dp.chart.Type;
import com.dp.chart.markline.MarkLine;
public class Series {
    private String name;
    private Type type;
    private MarkLine markLine;
    private Object[] data;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public Type getType() {
        return type;
    }
    public void setMarkLine(MarkLine markLine) {
        this.markLine = markLine;
    }
    public MarkLine getMarkLine() {
        return markLine;
    }
    public void setData(Object[] data) {
        this.data = data;
    }
    public Object[] getData() {
        return this.data;
    } 
}