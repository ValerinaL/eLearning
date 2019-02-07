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
@Table(name = "Profesori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesori.findAll", query = "SELECT p FROM Profesori p"),
    @NamedQuery(name = "Profesori.findByProfesoriId", query = "SELECT p FROM Profesori p WHERE p.profesoriId = :profesoriId"),
    @NamedQuery(name = "Profesori.findByProfesoriEmri", query = "SELECT p FROM Profesori p WHERE p.profesoriEmri = :profesoriEmri"),
    @NamedQuery(name = "Profesori.findByProfesoriMbiemri", query = "SELECT p FROM Profesori p WHERE p.profesoriMbiemri = :profesoriMbiemri"),
    @NamedQuery(name = "Profesori.findByProfesoriDataLindjes", query = "SELECT p FROM Profesori p WHERE p.profesoriDataLindjes = :profesoriDataLindjes"),
    @NamedQuery(name = "Profesori.findByProfesoriTelefoni", query = "SELECT p FROM Profesori p WHERE p.profesoriTelefoni = :profesoriTelefoni"),
    @NamedQuery(name = "Profesori.findByProfesoriMateriali", query = "SELECT p FROM Profesori p WHERE p.profesoriMateriali = :profesoriMateriali")})
public class Profesori implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Profesori_Id")
    private Integer profesoriId;
    @Basic(optional = false)
    @Column(name = "Profesori_Emri")
    private String profesoriEmri;
    @Basic(optional = false)
    @Column(name = "Profesori_Mbiemri")
    private String profesoriMbiemri;
    @Basic(optional = false)
    @Column(name = "Profesori_DataLindjes")
    private String profesoriDataLindjes;
    @Basic(optional = false)
    @Column(name = "Profesori_Telefoni")
    private String profesoriTelefoni;
    @Basic(optional = false)
    @Column(name = "Profesori_Materiali")
    private String profesoriMateriali;

    public Profesori() {
    }

    public Profesori(Integer profesoriId) {
        this.profesoriId = profesoriId;
    }

    public Profesori(Integer profesoriId, String profesoriEmri, String profesoriMbiemri, String profesoriDataLindjes, String profesoriTelefoni, String profesoriMateriali) {
        this.profesoriId = profesoriId;
        this.profesoriEmri = profesoriEmri;
        this.profesoriMbiemri = profesoriMbiemri;
        this.profesoriDataLindjes = profesoriDataLindjes;
        this.profesoriTelefoni = profesoriTelefoni;
        this.profesoriMateriali = profesoriMateriali;
    }

    public Integer getProfesoriId() {
        return profesoriId;
    }

    public void setProfesoriId(Integer profesoriId) {
        this.profesoriId = profesoriId;
    }

    public String getProfesoriEmri() {
        return profesoriEmri;
    }

    public void setProfesoriEmri(String profesoriEmri) {
        this.profesoriEmri = profesoriEmri;
    }

    public String getProfesoriMbiemri() {
        return profesoriMbiemri;
    }

    public void setProfesoriMbiemri(String profesoriMbiemri) {
        this.profesoriMbiemri = profesoriMbiemri;
    }

    public String getProfesoriDataLindjes() {
        return profesoriDataLindjes;
    }

    public void setProfesoriDataLindjes(String profesoriDataLindjes) {
        this.profesoriDataLindjes = profesoriDataLindjes;
    }

    public String getProfesoriTelefoni() {
        return profesoriTelefoni;
    }

    public void setProfesoriTelefoni(String profesoriTelefoni) {
        this.profesoriTelefoni = profesoriTelefoni;
    }

    public String getProfesoriMateriali() {
        return profesoriMateriali;
    }

    public void setProfesoriMateriali(String profesoriMateriali) {
        this.profesoriMateriali = profesoriMateriali;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profesoriId != null ? profesoriId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesori)) {
            return false;
        }
        Profesori other = (Profesori) object;
        if ((this.profesoriId == null && other.profesoriId != null) || (this.profesoriId != null && !this.profesoriId.equals(other.profesoriId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Profesori[ profesoriId=" + profesoriId + " ]";
    }

    public void setProfesoriID(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void s(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class getProfesori {

        public getProfesori() {
        }
    }
    
}
