package Model;

public class DataParser {
    private String name;
    private int id;
    private double probabilityOfLoss;

    public void parseData(String data){
        String[] inputData = data.split(" ");
        setId(inputData);
        setName(inputData);
        setProbabilityOfLoss(inputData);
    }


    public void setId(String[] dataArr){
        this.id = Integer.parseInt(dataArr[0]);
    }

    public void setName(String[] dataArr){
        this.name = dataArr[1];
    }

    public void setProbabilityOfLoss(String[] dataArr){
        this.probabilityOfLoss = Double.parseDouble(dataArr[2]);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getProbabilityOfLoss() {
        return probabilityOfLoss;
    }
}
