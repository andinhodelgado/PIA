/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.usinasantafe.pia.tb.estaticas;

/**
 *
 * @author anderson
 */

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import br.com.usinasantafe.pia.pst.Entidade;


@DatabaseTable(tableName="tborganismoest")
public class OrganTO extends Entidade {

	private static final long serialVersionUID = 1L;
	
	@DatabaseField(id=true)
    private Long idOrgan;
	@DatabaseField
	private Long codOrgan;
	@DatabaseField
	private String descrOrgan;

    public OrganTO() {
    }

	public Long getIdOrgan() {
		return idOrgan;
	}

	public void setIdOrgan(Long idOrgan) {
		this.idOrgan = idOrgan;
	}

	public Long getCodOrgan() {
		return codOrgan;
	}

	public void setCodOrgan(Long codOrgan) {
		this.codOrgan = codOrgan;
	}

	public String getDescrOrgan() {
		return descrOrgan;
	}

	public void setDescrOrgan(String descrOrgan) {
		this.descrOrgan = descrOrgan;
	}
}
