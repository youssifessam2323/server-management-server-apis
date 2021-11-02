package io.joework.servermanagementserverapis.domain;

 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import io.joework.servermanagementserverapis.utils.IP;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(indexes =  { 
    @Index(name = "nameidx", columnList = "name")
})
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @IP
    @Column(unique = true)
    private String ipAddress;

    private String name ;

    private String memory;
    
    private String type;
    
    private String imageUrl;

    private Status status;
}
