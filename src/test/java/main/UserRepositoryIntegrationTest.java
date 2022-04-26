package main;

import main.models.User;
import main.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void whenFindByNameThenReturnUser(){
        User user = new User("hamza_95",
                "Mike",
                "Kerry",
                "C3",
                "100",
                "ping12345",
                "mike@gmail.com");

        entityManager.persistAndFlush(user);

        User found = userRepository.findByUsername(user.getUsername()).get();

        assertThat(found.getUsername()).isEqualTo(user.getUsername());

    }
}
