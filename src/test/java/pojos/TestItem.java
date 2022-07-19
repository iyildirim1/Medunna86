package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestItem {

//    createdBy	string
//    createdDate	string($date-time)
//    defaultValMax	string
//    defaultValMin	string
//    description	string
//    id	integer($int64)
//    name	string
//    price*	number

    private String name;
    private int id;
    private Number price;
    private String description;
    private String defaultValMin;
    private String defaultValMax;
    private String createdDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Number getPrice() {
        return price;
    }

    public void setPrice(Number price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }


    @Override
    public String toString() {
        return "TestItem{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                ", createdDate='" + createdDate + '\'' +
                '}';
    }

    public String createTestBody(){

        return "{\n" +
                "  \"defaultValMax\": \""+defaultValMax+"\",\n" +
                "  \"defaultValMin\": \""+defaultValMin+"\",\n" +
                "  \"description\": \""+description+"\",\n" +
                "  \"name\": \""+name+"\",\n" +
                "  \"price\":"+price+" \n" +
                "}";
    }

    public String createTestBody2(){

        return "{\n" +
                "  \"defaultValMax\": \""+defaultValMax+"\",\n" +
                "  \"defaultValMin\": \""+defaultValMin+"\",\n" +
                "  \"description\": \""+description+"\",\n" +
                "  \"name\": \""+name+"\",\n" +
                "  \"price\":"+price+"\n" +
                "}";
    }
}
