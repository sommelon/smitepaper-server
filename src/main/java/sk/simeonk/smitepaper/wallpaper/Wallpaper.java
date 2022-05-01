package sk.simeonk.smitepaper.wallpaper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.simeonk.smitepaper.image.Image;
import sk.simeonk.smitepaper.tag.Tag;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wallpaper implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    private Set<Tag> tags = new HashSet<>();
    private String name;
    @Embedded
    private Image image;
}
