package com.mareli.mareli.bdconfig.Entitys;

import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class PersonaEntity {
    @Id
    @Column(name = "idpersona")
    private UUID idpersona;
    
    @Column(name = "idtipodocumento")
    private UUID idtipodocumento;
    
    @Column(name = "idsexo")
    private UUID idsexo;

    @Column(name = "sprimerapellido")
    private String sprimerapellido;

    @Column(name = "ssegundoapellido")
    private String ssegundoapellido;

    @Column(name = "snombres")
    private String snombres;

    @Column(name = "snumerodocumento")
    private String snumerodocumento;

    @Column(name = "dfechanacimiento")
    private Timestamp dfechanacimiento;

    @Column(name = "spaisnacimiento")
    private String spaisnacimiento;

    @Column(name = "sdeptonacimiento")
    private String sdeptonacimiento;

    @Column(name = "smupionacimiento")
    private String smupionacimiento;

    @Column(name = "spaisvive")
    private String spaisvive;

    @Column(name = "sdeptovive")
    private String sdeptovive;

    @Column(name = "smupiovive")
    private String smupiovive;

    @Column(name = "sdireccion")
    private String sdireccion;

    @Column(name = "idestadocivil")
    private UUID idestadocivil;

    @Column(name = "idgradoinstruccion")
    private UUID idgradoinstruccion;

    @Column(name = "idgruposanguineo")
    private UUID idgruposanguineo;

    @Column(name = "stelefono")
    private String stelefono;

    @Column(name = "scelular")
    private String scelular;

    @Column(name = "scorreoelectronico")
    private String scorreoelectronico;

    @Column(name = "idestado")
    private int idestado;

    @Column(name = "idgrupopoblacional")
    private UUID idgrupopoblacional;

    @Column(name = "rh")
    private String rh;

    public UUID getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(UUID idpersona) {
        this.idpersona = idpersona;
    }

    public UUID getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(UUID idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    public UUID getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(UUID idsexo) {
        this.idsexo = idsexo;
    }

    public String getSprimerapellido() {
        return sprimerapellido;
    }

    public void setSprimerapellido(String sprimerapellido) {
        this.sprimerapellido = sprimerapellido;
    }

    public String getSsegundoapellido() {
        return ssegundoapellido;
    }

    public void setSsegundoapellido(String ssegundoapellido) {
        this.ssegundoapellido = ssegundoapellido;
    }

    public String getSnombres() {
        return snombres;
    }

    public void setSnombres(String snombres) {
        this.snombres = snombres;
    }

    public String getSnumerodocumento() {
        return snumerodocumento;
    }

    public void setSnumerodocumento(String snumerodocumento) {
        this.snumerodocumento = snumerodocumento;
    }

    public Timestamp getDfechanacimiento() {
        return dfechanacimiento;
    }

    public void setDfechanacimiento(Timestamp dfechanacimiento) {
        this.dfechanacimiento = dfechanacimiento;
    }

    public String getSpaisnacimiento() {
        return spaisnacimiento;
    }

    public void setSpaisnacimiento(String spaisnacimiento) {
        this.spaisnacimiento = spaisnacimiento;
    }

    public String getSdeptonacimiento() {
        return sdeptonacimiento;
    }

    public void setSdeptonacimiento(String sdeptonacimiento) {
        this.sdeptonacimiento = sdeptonacimiento;
    }

    public String getSmupionacimiento() {
        return smupionacimiento;
    }

    public void setSmupionacimiento(String smupionacimiento) {
        this.smupionacimiento = smupionacimiento;
    }

    public String getSpaisvive() {
        return spaisvive;
    }

    public void setSpaisvive(String spaisvive) {
        this.spaisvive = spaisvive;
    }

    public String getSdeptovive() {
        return sdeptovive;
    }

    public void setSdeptovive(String sdeptovive) {
        this.sdeptovive = sdeptovive;
    }

    public String getSmupiovive() {
        return smupiovive;
    }

    public void setSmupiovive(String smupiovive) {
        this.smupiovive = smupiovive;
    }

    public String getSdireccion() {
        return sdireccion;
    }

    public void setSdireccion(String sdireccion) {
        this.sdireccion = sdireccion;
    }

    public UUID getIdestadocivil() {
        return idestadocivil;
    }

    public void setIdestadocivil(UUID idestadocivil) {
        this.idestadocivil = idestadocivil;
    }

    public UUID getIdgradoinstruccion() {
        return idgradoinstruccion;
    }

    public void setIdgradoinstruccion(UUID idgradoinstruccion) {
        this.idgradoinstruccion = idgradoinstruccion;
    }

    public UUID getIdgruposanguineo() {
        return idgruposanguineo;
    }

    public void setIdgruposanguineo(UUID idgruposanguineo) {
        this.idgruposanguineo = idgruposanguineo;
    }

    public String getStelefono() {
        return stelefono;
    }

    public void setStelefono(String stelefono) {
        this.stelefono = stelefono;
    }

    public String getScelular() {
        return scelular;
    }

    public void setScelular(String scelular) {
        this.scelular = scelular;
    }

    public String getScorreoelectronico() {
        return scorreoelectronico;
    }

    public void setScorreoelectronico(String scorreoelectronico) {
        this.scorreoelectronico = scorreoelectronico;
    }

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public UUID getIdgrupopoblacional() {
        return idgrupopoblacional;
    }

    public void setIdgrupopoblacional(UUID idgrupopoblacional) {
        this.idgrupopoblacional = idgrupopoblacional;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }
    


}
