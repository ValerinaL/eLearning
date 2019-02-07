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
@Table(name = "Stafi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stafi.findAll", query = "SELECT s FROM Stafi s"),
    @NamedQuery(name = "Stafi.findByStafiId", query = "SELECT s FROM Stafi s WHERE s.stafiId = :stafiId"),
    @NamedQuery(name = "Stafi.findByStafiEmri", query = "SELECT s FROM Stafi s WHERE s.stafiEmri = :stafiEmri"),
    @NamedQuery(name = "Stafi.findByStafiMbiemri", query = "SELECT s FROM Stafi s WHERE s.stafiMbiemri = :stafiMbiemri"),
    @NamedQuery(name = "Stafi.findByStafiTelefoni", query = "SELECT s FROM Stafi s WHERE s.stafiTelefoni = :stafiTelefoni"),
    @NamedQuery(name = "Stafi.findByStafiDataLindjes", query = "SELECT s FROM Stafi s WHERE s.stafiDataLindjes = :stafiDataLindjes"),
    @NamedQuery(name = "Stafi.findByStafiEmail", query = "SELECT s FROM Stafi s WHERE s.stafiEmail = :stafiEmail"),
    @NamedQuery(name = "Stafi.findByStafiPassword", query = "SELECT s FROM Stafi s WHERE s.stafiPassword = :stafiPassword")})
public class Stafi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Stafi_Id")
    private Integer stafiId;
    @Basic(optional = false)
    @Column(name = "Stafi_Emri")
    private String stafiEmri;
    @Basic(optional = false)
    @Column(name = "Stafi_Mbiemri")
    private String stafiMbiemri;
    @Basic(optional = false)
    @Column(name = "Stafi_Telefoni")
    private String stafiTelefoni;
    @Basic(optional = false)
    @Column(name = "Stafi_DataLindjes")
    @Temporal(TemporalType.DATE)
    private Date stafiDataLindjes;
    @Basic(optional = false)
    @Column(name = "Stafi_Email")
    private String stafiEmail;
    @Basic(optional = false)
    @Column(name = "Stafi_Password")
    private String stafiPassword;

    public Stafi() {
    }

    public Stafi(Integer stafiId) {
        this.stafiId = stafiId;
    }

    public Stafi(Integer stafiId, String stafiEmri, String stafiMbiemri, String stafiTelefoni, Date stafiDataLindjes, String stafiEmail, String stafiPassword) {
        this.stafiId = stafiId;
        this.stafiEmri = stafiEmri;
        this.stafiMbiemri = stafiMbiemri;
        this.stafiTelefoni = stafiTelefoni;
        this.stafiDataLindjes = stafiDataLindjes;
        this.stafiEmail = stafiEmail;
        this.stafiPassword = stafiPassword;
    }

    public Integer getStafiId() {
        return stafiId;
    }

    public void setStafiId(Integer stafiId) {
        this.stafiId = stafiId;
    }

    public String getStafiEmri() {
        return stafiEmri;
    }

    public void setStafiEmri(String stafiEmri) {
        this.stafiEmri = stafiEmri;
    }

    public String getStafiMbiemri() {
        return stafiMbiemri;
    }

    public void setStafiMbiemri(String stafiMbiemri) {
        this.stafiMbiemri = stafiMbiemri;
    }

    public String getStafiTelefoni() {
        return stafiTelefoni;
    }

    public void setStafiTelefoni(String stafiTelefoni) {
        this.stafiTelefoni = stafiTelefoni;
    }

    public Date getStafiDataLindjes() {
        return stafiDataLindjes;
    }

    public void setStafiDataLindjes(Date stafiDataLindjes) {
        this.stafiDataLindjes = stafiDataLindjes;
    }

    public String getStafiEmail() {
        return stafiEmail;
    }

    public void setStafiEmail(String stafiEmail) {
        this.stafiEmail = stafiEmail;
    }

    public String getStafiPassword() {
        return stafiPassword;
    }

    public void setStafiPassword(String stafiPassword) {
        this.stafiPassword = stafiPassword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stafiId != null ? stafiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stafi)) {
            return false;
        }
        Stafi other = (Stafi) object;
        if ((this.stafiId == null && other.stafiId != null) || (this.stafiId != null && !this.stafiId.equals(other.stafiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Stafi[ stafiId=" + stafiId + " ]";
    }
    
}
