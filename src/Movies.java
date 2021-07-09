import java.util.*;

public class Movies {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<>();
        Random rand = new Random();

        String response;

        do {
            System.out.println("Enter a name of your favorite movie: ");
            String movie = input.nextLine();

            movies.add(movie);

            System.out.println("Would you like to add another movie? y/n");
            response = input.nextLine().toLowerCase(Locale.ROOT);

        }while (response.charAt(0) == 'y');

        System.out.println(movies);
        Collections.sort(movies);
        System.out.println(movies);

        int randIndexOfMovies = rand.nextInt(movies.size());
        String randMovie = movies.get(randIndexOfMovies);
        System.out.println("We will suggest you to watch " + "'" + randMovie + "'.");


    }

}
