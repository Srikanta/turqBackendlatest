package io.turq.turq.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "legislation")
public class LegislationEntity {

    public LegislationEntity(String title, String ref, UserEntity author, ContestEntity contest) {
        this.title = title;
        this.ref = ref;
        this.author = author;
        this.contest = contest;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String ref;
    
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "legislation_author_id_fkey"))
    private UserEntity author;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "legislation_contest_id_fkey"))
    private ContestEntity contest;
}

