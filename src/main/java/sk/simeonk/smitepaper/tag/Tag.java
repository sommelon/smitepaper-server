package sk.simeonk.smitepaper.tag;

import lombok.Data;
import lombok.NoArgsConstructor;
import sk.simeonk.smitepaper.wallpaper.Wallpaper;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Boolean isApproved;
    @ManyToMany(mappedBy = "tags")
    private Set<Wallpaper> wallpapers = new HashSet<>();
}
