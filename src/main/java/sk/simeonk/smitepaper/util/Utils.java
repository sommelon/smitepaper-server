package sk.simeonk.smitepaper.util;

import java.net.URL;

public class Utils {
    /**
     * This is how some cases are handled:
     * <blockquote><pre>
     *     http://ggg.gg/ -> "/" -> ""
     *     http://ggg.gg/image -> "/image/" -> ""
     *     http://ggg.gg/image.jpg -> "jpg" -> "jpg"
     *     http://ggg.gg/image.jpg/ -> "jpg/" -> "jpg"
     *     http://ggg.gg/image.jpg/fjewio -> "jpg/fjewio" -> "jpg"
     *     http://ggg.gg/image.jpg/fjewio/fjewi.png -> "png" -> "png"
     *     http://ggg.gg/image.jpg/fjewio/fjewi.png/ -> "png/" -> "png"
     *     http://ggg.gg/image.jpg/fjewio/fjewi.png/fewfew -> "png/fewfew" -> "png"
     * </pre></blockquote>
     * @param url   the URL to guess the file extension from
     * @return the guessed filename from the URL
     */
    public static String guessFileExtensionFromURL(URL url) {
        if (url == null) {
            return null;
        }

        String fileExtension = url.getPath()
                .replaceFirst(".*\\.([^\\.]*|)/?$", "$1")
                .replaceFirst("(\\w*|).*", "$1")
                ;
        return fileExtension.isEmpty() ? null : fileExtension;
    }
}
