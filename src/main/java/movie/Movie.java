package movie;

public class Movie {
    private int sumOfRate = 0;
    private int countOfRate = 0;

    public Integer averageRating() {
        return countOfRate == 0 ? 0 : sumOfRate/countOfRate;
    }

    public Integer rate(int i) {
        countOfRate++;
        return sumOfRate += i;
    }
}
