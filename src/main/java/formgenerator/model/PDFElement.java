/*
 * PDFElement is a java class that contains the element of the form.
 * id: a unique identifier for the PDFElement
 * formElement: a reference to the formElement object that is related to the PDFElement
 */

package formgenerator.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PDFElement implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pdfElement_Id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	
		
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}  
}
