package sk.simeonk.smitepaper.tag;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.simeonk.smitepaper.wallpaper.Wallpaper;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
