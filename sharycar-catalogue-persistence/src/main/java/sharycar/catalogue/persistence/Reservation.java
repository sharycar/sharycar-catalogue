package sharycar.catalogue.persistence;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "reservations")
@NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="car_id")
    private Car car;


    @Column(nullable = false)
    private Integer user_id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date toDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date reservationTime;

    public Date getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(Date reservationTime) {
        this.reservationTime = reservationTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Car getCar() {
        // Do not show reservations here
        if (car != null) {
            car.setReservationList(null);
        }
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getFromDateTime() {
        return fromDateTime;
    }

    public void setFromDateTime(Date fromDateTime) {
        this.fromDateTime = fromDateTime;
    }

    public Date getToDateTime() {
        return toDateTime;
    }

    public void setToDateTime(Date toDateTime) {
        this.toDateTime = toDateTime;
    }
}

