package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "Materiali")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materiali.findAll", query = "SELECT m FROM Materiali m"),
    @NamedQuery(name = "Materiali.findByIsbn", query = "SELECT m FROM Materiali m WHERE m.isbn = :isbn"),
    @NamedQuery(name = "Materiali.findByProfesoriId", query = "SELECT m FROM Materiali m WHERE m.profesoriId = :profesoriId"),
    @NamedQuery(name = "Materiali.findByLibri", query = "SELECT m FROM Materiali m WHERE m.libri = :libri"),
    @NamedQuery(name = "Materiali.findByUshtrimet", query = "SELECT m FROM Materiali m WHERE m.ushtrimet = :ushtrimet"),
    @NamedQuery(name = "Materiali.findByTutorials", query = "SELECT m FROM Materiali m WHERE m.tutorials = :tutorials")})
public class Materiali implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ISBN")
    private Integer isbn;
    @Basic(optional = false)
    @Column(name = "Profesori_Id")
    private int profesoriId;
    @Basic(optional = false)
    @Column(name = "Libri")
    private String libri;
    @Basic(optional = false)
    @Column(name = "Ushtrimet")
    private String ushtrimet;
    @Basic(optional = false)
    @Column(name = "Tutorials")
    private String tutorials;

    public Materiali() {
    }

    public Materiali(Integer isbn) {
        this.isbn = isbn;
    }

    public Materiali(Integer isbn, int profesoriId, String libri, String ushtrimet, String tutorials) {
        this.isbn = isbn;
        this.profesoriId = profesoriId;
        this.libri = libri;
        this.ushtrimet = ushtrimet;
        this.tutorials = tutorials;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public int getProfesoriId() {
        return profesoriId;
    }

    public void setProfesoriId(int profesoriId) {
        this.profesoriId = profesoriId;
    }

    public String getLibri() {
        return libri;
    }

    public void setLibri(String libri) {
        this.libri = libri;
    }

    public String getUshtrimet() {
        return ushtrimet;
    }

    public void setUshtrimet(String ushtrimet) {
        this.ushtrimet = ushtrimet;
    }

    public String getTutorials() {
        return tutorials;
    }

    public void setTutorials(String tutorials) {
        this.tutorials = tutorials;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materiali)) {
            return false;
        }
        Materiali other = (Materiali) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Materiali[ isbn=" + isbn + " ]";
    }
    
}
