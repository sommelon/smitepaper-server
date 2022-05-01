package sk.simeonk.smitepaper.image;

import lombok.*;
import sk.simeonk.smitepaper.util.Utils;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import java.net.URL;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    @Column(length = 2048)
    private URL link;
    private Integer width;
    private Integer height;
    @Transient
    @Setter(value = AccessLevel.NONE)
    private String fileExtension;

    public String getFileExtension() {
        return Utils.guessFileExtensionFromURL(getLink());
    }
}
