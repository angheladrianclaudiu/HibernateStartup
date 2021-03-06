package entity;

import javax.persistence.*;

@Entity
@Table(name="MESSAGE")
public class Message {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column(name="TEXT")
    private String text;

    public Message(){}
    public Message(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
