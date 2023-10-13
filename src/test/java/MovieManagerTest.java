import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void movieAddTest() {
        MovieManager manager = new MovieManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void movieAddTest1() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");

        String[] actual = manager.findAll();
        String[] expected = { "Film I" };
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void movieAddTest2() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findAll();
        String[] expected = { "Film I", "Film II", "Film III" };

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void movieAddTest3() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findLast();
        String[] expected = { "Film III", "Film II", "Film I" };

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void movieAddTest4() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");


        String[] actual = manager.findLast();
        String[] expected = { "Film V", "Film IV", "Film III", "Film II", "Film I" };

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void movieAddTest5() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");




        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III", "Film IV","Film V", "Film VI"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void movieAddTest6() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");

        String[] actual = manager.findLast();
        String[] expected = { "Film VI", "Film V", "Film IV", "Film III", "Film II" };

        Assertions.assertArrayEquals(expected, actual);

    }


}





