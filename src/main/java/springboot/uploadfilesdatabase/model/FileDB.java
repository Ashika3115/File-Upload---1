package springboot.uploadfilesdatabase.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "files")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class FileDB {


	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	
	  private long id;

	  private String name;
	  
	  private String type;

	  @Lob
	  @Column(length = 20971520)
	  private byte[] data;

	public FileDB(String name, String type, byte[] data) {
		
		this.name = name;
		this.type = type;
		this.data = data;
	}
	  
	  
	
}
