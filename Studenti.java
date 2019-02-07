package BLL;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "Studenti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studenti.findAll", query = "SELECT s FROM Studenti s"),
    @NamedQuery(name = "Studenti.findByStudentiId", query = "SELECT s FROM Studenti s WHERE s.studentiId = :studentiId"),
    @NamedQuery(name = "Studenti.findByStudentiEmri", query = "SELECT s FROM Studenti s WHERE s.studentiEmri = :studentiEmri"),
    @NamedQuery(name = "Studenti.findByStudentiMbiemri", query = "SELECT s FROM Studenti s WHERE s.studentiMbiemri = :studentiMbiemri"),
    @NamedQuery(name = "Studenti.findByStudentiDataLindjes", query = "SELECT s FROM Studenti s WHERE s.studentiDataLindjes = :studentiDataLindjes"),
    @NamedQuery(name = "Studenti.findByStudentiEmail", query = "SELECT s FROM Studenti s WHERE s.studentiEmail = :studentiEmail"),
    @NamedQuery(name = "Studenti.findByStudentiTelefoni", query = "SELECT s FROM Studenti s WHERE s.studentiTelefoni = :studentiTelefoni"),
    @NamedQuery(name = "Studenti.findByStudentiDataRegjistrimit", query = "SELECT s FROM Studenti s WHERE s.studentiDataRegjistrimit = :studentiDataRegjistrimit")})
public class Studenti implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Studenti_Id")
    private Integer studentiId;
    @Basic(optional = false)
    @Column(name = "Studenti_Emri")
    private String studentiEmri;
    @Basic(optional = false)
    @Column(name = "Studenti_Mbiemri")
    private String studentiMbiemri;
    @Basic(optional = false)
    @Column(name = "Studenti_DataLindjes")
    @Temporal(TemporalType.DATE)
    private Date studentiDataLindjes;
    @Basic(optional = false)
    @Column(name = "Studenti_Email")
    private String studentiEmail;
    @Basic(optional = false)
    @Column(name = "Studenti_Telefoni")
    private String studentiTelefoni;
    @Basic(optional = false)
    @Column(name = "Studenti_DataRegjistrimit")
    private String studentiDataRegjistrimit;

    public Studenti() {
    }

    public Studenti(Integer studentiId) {
        this.studentiId = studentiId;
    }

    public Studenti(Integer studentiId, String studentiEmri, String studentiMbiemri, Date studentiDataLindjes, String studentiEmail, String studentiTelefoni, String studentiDataRegjistrimit) {
        this.studentiId = studentiId;
        this.studentiEmri = studentiEmri;
        this.studentiMbiemri = studentiMbiemri;
        this.studentiDataLindjes = studentiDataLindjes;
        this.studentiEmail = studentiEmail;
        this.studentiTelefoni = studentiTelefoni;
        this.studentiDataRegjistrimit = studentiDataRegjistrimit;
    }

    public Integer getStudentiId() {
        return studentiId;
    }

    public void setStudentiId(Integer studentiId) {
        this.studentiId = studentiId;
    }

    public String getStudentiEmri() {
        return studentiEmri;
    }

    public void setStudentiEmri(String studentiEmri) {
        this.studentiEmri = studentiEmri;
    }

    public String getStudentiMbiemri() {
        return studentiMbiemri;
    }

    public void setStudentiMbiemri(String studentiMbiemri) {
        this.studentiMbiemri = studentiMbiemri;
    }

    public Date getStudentiDataLindjes() {
        return studentiDataLindjes;
    }

    public void setStudentiDataLindjes(Date studentiDataLindjes) {
        this.studentiDataLindjes = studentiDataLindjes;
    }

    public String getStudentiEmail() {
        return studentiEmail;
    }

    public void setStudentiEmail(String studentiEmail) {
        this.studentiEmail = studentiEmail;
    }

    public String getStudentiTelefoni() {
        return studentiTelefoni;
    }

    public void setStudentiTelefoni(String studentiTelefoni) {
        this.studentiTelefoni = studentiTelefoni;
    }

    public String getStudentiDataRegjistrimit() {
        return studentiDataRegjistrimit;
    }

    public void setStudentiDataRegjistrimit(String studentiDataRegjistrimit) {
        this.studentiDataRegjistrimit = studentiDataRegjistrimit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentiId != null ? studentiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studenti)) {
            return false;
        }
        Studenti other = (Studenti) object;
        if ((this.studentiId == null && other.studentiId != null) || (this.studentiId != null && !this.studentiId.equals(other.studentiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Studenti[ studentiId=" + studentiId + " ]";
    }
    
}
