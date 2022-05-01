package sk.simeonk.smitepaper.user;

import javax.persistence.Id;
import java.util.UUID;

// TODO
public class User {
    @Id
    private UUID id;
    private String username;
}
