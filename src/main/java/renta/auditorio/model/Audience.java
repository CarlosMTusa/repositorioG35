
// Archivo Audience para la Aplicación Renta de Auditorios
// Presentado por Carlos Blanco
// Ciclo 3 - Grupo G35 - Desarrollo de Software


package renta.auditorio.model;

// Bloque de Imports.

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "audience")

// Definición de Clase Audience y sus atributos.

public class Audience implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 
    private String name; 
    private String owner; 
    private Integer capacity; 
    private String description; 
    
    // Definicion de Relaciones.
    
    // Muchos a Uno.
    
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("audiences")
    private Category category; // relacion con categoria
    
    // Uno a Muchos.

    @OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "audience")
    @JsonIgnoreProperties({ "audience", "client" })
    private List<Message> messages; // relacion con mensajes

    @OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "audience")
    @JsonIgnoreProperties({ "audience", "client" })
    private List<Reservation> reservations; // relacion con reservaciones

    // Bloque de Get and Set para Atributos y Relaciones.
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

}

