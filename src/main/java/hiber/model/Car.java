package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id", nullable = false)
    private Long id;

    @Column(name = "series")
    private int series;

    @Column(name = "model")
    private String model;
    //private int series;

    @OneToOne(mappedBy = "car")
    private User user;

    public Car() {

    }

    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }
    public void setSeries(int series) {
        this.series = series;
    }
    public int getSeries(){
        return series;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel(){
        return model;
    }

}
